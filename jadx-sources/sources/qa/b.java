package qa;

import ja.f;
import ja.h;
import pi.o;
import qj.z;
import tj.i0;
import tj.l;
import tj.n;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b extends i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13320a;

    /* renamed from: b, reason: collision with root package name */
    public int f13321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f13322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f6.a f13323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, f6.a aVar, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f13320a = i10;
        this.f13322c = cVar;
        this.f13323d = aVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f13320a) {
            case 0:
                return new b(this.f13322c, this.f13323d, cVar, 0);
            default:
                return new b(this.f13322c, this.f13323d, cVar, 1);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f13320a) {
        }
        return ((b) create(zVar, cVar)).invokeSuspend(o.f13011a);
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f13320a) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f13321b;
                ti.c cVar = null;
                c cVar2 = this.f13322c;
                int i11 = 2;
                if (i10 == 0) {
                    uk.c.R(obj);
                    h hVar = cVar2.f13324a;
                    this.f13321b = 1;
                    ja.d dVar = new ja.d(new n(new l(new ja.e(i11, cVar, 0), hVar.f8780d), new f(hVar, null, 0)), hVar, 0);
                    if (dVar == aVar) {
                        return aVar;
                    }
                    obj = dVar;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        return o.f13011a;
                    }
                    uk.c.R(obj);
                }
                a aVar2 = new a(cVar2, cVar, 2);
                this.f13321b = 2;
                if (i0.g((tj.e) obj, aVar2, this) == aVar) {
                    return aVar;
                }
                return o.f13011a;
            default:
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f13321b;
                ti.c cVar3 = null;
                c cVar4 = this.f13322c;
                int i13 = 2;
                if (i12 == 0) {
                    uk.c.R(obj);
                    h hVar2 = cVar4.f13324a;
                    this.f13321b = 1;
                    ja.d dVar2 = new ja.d(new n(new l(new ja.e(i13, cVar3, 1), hVar2.f8780d), new f(hVar2, null, 1)), hVar2, 1);
                    if (dVar2 == aVar3) {
                        return aVar3;
                    }
                    obj = dVar2;
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uk.c.R(obj);
                        return o.f13011a;
                    }
                    uk.c.R(obj);
                }
                a aVar4 = new a(cVar4, cVar3, 5);
                this.f13321b = 2;
                if (i0.g((tj.e) obj, aVar4, this) == aVar3) {
                    return aVar3;
                }
                return o.f13011a;
        }
    }
}
