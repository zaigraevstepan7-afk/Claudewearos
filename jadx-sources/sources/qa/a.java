package qa;

import a9.f;
import android.util.Log;
import pi.o;
import tj.h0;
import vi.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a extends i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13316a;

    /* renamed from: b, reason: collision with root package name */
    public int f13317b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f13319d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, ti.c cVar2, int i10) {
        super(2, cVar2);
        this.f13316a = i10;
        this.f13319d = cVar;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f13316a) {
            case 0:
                a aVar = new a(this.f13319d, cVar, 0);
                aVar.f13318c = obj;
                return aVar;
            case 1:
                a aVar2 = new a(this.f13319d, cVar, 1);
                aVar2.f13318c = obj;
                return aVar2;
            case 2:
                a aVar3 = new a(this.f13319d, cVar, 2);
                aVar3.f13318c = obj;
                return aVar3;
            case 3:
                a aVar4 = new a(this.f13319d, cVar, 3);
                aVar4.f13318c = obj;
                return aVar4;
            case 4:
                a aVar5 = new a(this.f13319d, cVar, 4);
                aVar5.f13318c = obj;
                return aVar5;
            default:
                a aVar6 = new a(this.f13319d, cVar, 5);
                aVar6.f13318c = obj;
                return aVar6;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13316a) {
            case 0:
                return ((a) create((a9.e) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 1:
                return ((a) create((a9.d) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 2:
                return ((a) create((f) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 3:
                return ((a) create((a9.e) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            case 4:
                return ((a) create((a9.d) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
            default:
                return ((a) create((f) obj, (ti.c) obj2)).invokeSuspend(o.f13011a);
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f13316a) {
            case 0:
                a9.e eVar = (a9.e) this.f13318c;
                ui.a aVar = ui.a.f17085a;
                int i10 = this.f13317b;
                if (i10 == 0) {
                    uk.c.R(obj);
                    h0 h0Var = this.f13319d.f13327d;
                    Object obj2 = eVar.f223a;
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (h0Var.b(obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 1:
                a9.d dVar = (a9.d) this.f13318c;
                ui.a aVar2 = ui.a.f17085a;
                int i11 = this.f13317b;
                if (i11 == 0) {
                    uk.c.R(obj);
                    h0 h0Var2 = this.f13319d.f13328e;
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (h0Var2.b(dVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 2:
                f fVar = (f) this.f13318c;
                ui.a aVar3 = ui.a.f17085a;
                int i12 = this.f13317b;
                if (i12 == 0) {
                    uk.c.R(obj);
                    Log.d("DisplayablesUpdatesUseCaseImp", "New dock apps result: " + fVar);
                    c cVar = this.f13319d;
                    ti.c cVar2 = null;
                    a aVar4 = new a(cVar, cVar2, 0);
                    a aVar5 = new a(cVar, cVar2, 1);
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (wd.a.w(fVar, aVar4, aVar5, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 3:
                a9.e eVar2 = (a9.e) this.f13318c;
                ui.a aVar6 = ui.a.f17085a;
                int i13 = this.f13317b;
                if (i13 == 0) {
                    uk.c.R(obj);
                    h0 h0Var3 = this.f13319d.f13326c;
                    Object obj3 = eVar2.f223a;
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (h0Var3.b(obj3, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            case 4:
                a9.d dVar2 = (a9.d) this.f13318c;
                ui.a aVar7 = ui.a.f17085a;
                int i14 = this.f13317b;
                if (i14 == 0) {
                    uk.c.R(obj);
                    h0 h0Var4 = this.f13319d.f13328e;
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (h0Var4.b(dVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
            default:
                f fVar2 = (f) this.f13318c;
                ui.a aVar8 = ui.a.f17085a;
                int i15 = this.f13317b;
                if (i15 == 0) {
                    uk.c.R(obj);
                    Log.d("DisplayablesUpdatesUseCaseImp", "New grid apps result: " + fVar2);
                    c cVar3 = this.f13319d;
                    ti.c cVar4 = null;
                    a aVar9 = new a(cVar3, cVar4, 3);
                    a aVar10 = new a(cVar3, cVar4, 4);
                    this.f13318c = null;
                    this.f13317b = 1;
                    if (wd.a.w(fVar2, aVar9, aVar10, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uk.c.R(obj);
                }
                return o.f13011a;
        }
    }
}
