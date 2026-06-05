package nb;

import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import mi.d0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f12071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, float f10, ti.c cVar, int i10) {
        super(2, cVar);
        this.f12069a = i10;
        this.f12070b = obj;
        this.f12071c = f10;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f12069a) {
            case 0:
                return new t((ej.c) this.f12070b, this.f12071c, cVar, 0);
            case 1:
                return new t((ej.c) this.f12070b, this.f12071c, cVar, 1);
            case 2:
                return new t((ej.c) this.f12070b, this.f12071c, cVar, 2);
            case 3:
                return new t((ej.c) this.f12070b, this.f12071c, cVar, 3);
            default:
                return new t((d0) this.f12070b, this.f12071c, cVar, 4);
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f12069a) {
            case 0:
                t tVar = (t) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                tVar.invokeSuspend(oVar);
                return oVar;
            case 1:
                t tVar2 = (t) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                tVar2.invokeSuspend(oVar2);
                return oVar2;
            case 2:
                t tVar3 = (t) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                tVar3.invokeSuspend(oVar3);
                return oVar3;
            case 3:
                t tVar4 = (t) create(zVar, cVar);
                pi.o oVar4 = pi.o.f13011a;
                tVar4.invokeSuspend(oVar4);
                return oVar4;
            default:
                t tVar5 = (t) create(zVar, cVar);
                pi.o oVar5 = pi.o.f13011a;
                tVar5.invokeSuspend(oVar5);
                return oVar5;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f12069a;
        pi.o oVar = pi.o.f13011a;
        float f10 = this.f12071c;
        Object obj2 = this.f12070b;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                ((ej.c) obj2).invoke(new Float(f10));
                break;
            case 1:
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                ((ej.c) obj2).invoke(new Float(f10));
                break;
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                ((ej.c) obj2).invoke(new Float(f10));
                break;
            case 3:
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                ((ej.c) obj2).invoke(new Float(f10));
                break;
            default:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                d0 d0Var = (d0) obj2;
                Allocation allocation = d0Var.f11749e;
                ScriptIntrinsicBlur scriptIntrinsicBlur = d0Var.f11747c;
                if (!d0Var.f11752h) {
                    if (f10 > 25.0f) {
                        f10 = 25.0f;
                    }
                    scriptIntrinsicBlur.setRadius(f10);
                    scriptIntrinsicBlur.forEach(allocation);
                    if (!d0Var.f11752h) {
                        allocation.copyTo(d0Var.f11750f);
                        break;
                    }
                }
                break;
        }
        return oVar;
    }
}
