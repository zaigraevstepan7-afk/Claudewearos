package qi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class z extends vi.h implements ej.e {
    public final /* synthetic */ Iterator A;

    /* renamed from: b, reason: collision with root package name */
    public Object f13531b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f13532c;

    /* renamed from: d, reason: collision with root package name */
    public int f13533d;

    /* renamed from: e, reason: collision with root package name */
    public int f13534e;

    /* renamed from: f, reason: collision with root package name */
    public int f13535f;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f13536z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Iterator it, ti.c cVar) {
        super(cVar);
        this.A = it;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        z zVar = new z(this.A, cVar);
        zVar.f13536z = obj;
        return zVar;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((mj.g) obj, (ti.c) obj2)).invokeSuspend(pi.o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        Iterator it;
        int i13;
        int i14;
        int i15;
        y yVar;
        Object[] array;
        mj.g gVar = (mj.g) this.f13536z;
        ui.a aVar = ui.a.f17085a;
        int i16 = this.f13535f;
        boolean z2 = true;
        if (i16 == 0) {
            i10 = 1;
            uk.c.R(obj);
            i11 = 0;
            i12 = 0;
            arrayList = new ArrayList(20);
            it = this.A;
            i13 = 20;
        } else {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        i14 = this.f13534e;
                        int i17 = this.f13533d;
                        Iterator it2 = this.f13532c;
                        y yVar2 = (y) this.f13531b;
                        uk.c.R(obj);
                        yVar2.e();
                        while (true) {
                            int i18 = yVar2.f13528b;
                            Object[] objArr = yVar2.f13527a;
                            if (!it2.hasNext()) {
                                i15 = i17;
                                yVar = yVar2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z10 = z2;
                            if (yVar2.b() == i18) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i19 = yVar2.f13529c;
                            int i20 = yVar2.f13530d;
                            objArr[(i19 + i20) % i18] = next;
                            yVar2.f13530d = i20 + 1;
                            if (yVar2.b() == i18) {
                                if (yVar2.f13530d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(yVar2);
                                    this.f13536z = gVar;
                                    this.f13531b = yVar2;
                                    this.f13532c = it2;
                                    this.f13533d = i17;
                                    this.f13534e = i14;
                                    this.f13535f = 3;
                                    gVar.b(arrayList2, this);
                                    ui.a aVar2 = ui.a.f17085a;
                                    return aVar;
                                }
                                int i21 = i18 + (i18 >> 1) + 1;
                                if (i21 > 20) {
                                    i21 = 20;
                                }
                                if (yVar2.f13529c == 0) {
                                    array = Arrays.copyOf(objArr, i21);
                                    fj.l.e(array, "copyOf(...)");
                                } else {
                                    array = yVar2.toArray(new Object[i21]);
                                }
                                yVar2 = new y(array, yVar2.f13530d);
                            }
                            z2 = z10;
                        }
                    } else if (i16 == 4) {
                        i14 = this.f13534e;
                        i15 = this.f13533d;
                        yVar = (y) this.f13531b;
                        uk.c.R(obj);
                        yVar.e();
                    } else {
                        if (i16 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    if (yVar.f13530d > 20) {
                        ArrayList arrayList3 = new ArrayList(yVar);
                        this.f13536z = gVar;
                        this.f13531b = yVar;
                        this.f13532c = null;
                        this.f13533d = i15;
                        this.f13534e = i14;
                        this.f13535f = 4;
                        gVar.b(arrayList3, this);
                        ui.a aVar3 = ui.a.f17085a;
                        return aVar;
                    }
                    if (!yVar.isEmpty()) {
                        this.f13536z = null;
                        this.f13531b = null;
                        this.f13532c = null;
                        this.f13533d = i15;
                        this.f13534e = i14;
                        this.f13535f = 5;
                        gVar.b(yVar, this);
                        ui.a aVar4 = ui.a.f17085a;
                        return aVar;
                    }
                    return pi.o.f13011a;
                }
                uk.c.R(obj);
                return pi.o.f13011a;
            }
            i10 = 1;
            i11 = this.f13534e;
            int i22 = this.f13533d;
            Iterator it3 = this.f13532c;
            uk.c.R(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i13 = i22;
            i12 = i11;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i11 > 0) {
                i11--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f13536z = gVar;
                    this.f13531b = arrayList;
                    this.f13532c = it;
                    this.f13533d = i13;
                    this.f13534e = i12;
                    this.f13535f = i10;
                    gVar.b(arrayList, this);
                    ui.a aVar5 = ui.a.f17085a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f13536z = null;
            this.f13531b = null;
            this.f13532c = null;
            this.f13533d = i13;
            this.f13534e = i12;
            this.f13535f = 2;
            gVar.b(arrayList, this);
            ui.a aVar6 = ui.a.f17085a;
            return aVar;
        }
        return pi.o.f13011a;
    }
}
