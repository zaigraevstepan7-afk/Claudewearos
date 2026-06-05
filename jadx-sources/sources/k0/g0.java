package k0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import f1.q2;
import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 extends vi.i implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9097a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9099c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9101e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, q2 q2Var, ti.c cVar, int i10) {
        super(2, cVar);
        this.f9097a = i10;
        this.f9098b = obj;
        this.f9099c = obj2;
        this.f9100d = obj3;
        this.f9101e = q2Var;
    }

    @Override // vi.a
    public final ti.c create(Object obj, ti.c cVar) {
        switch (this.f9097a) {
            case 0:
                g0 g0Var = new g0((p2.a0) this.f9099c, (b1) this.f9100d, (v0.u0) this.f9101e, cVar, 0);
                g0Var.f9098b = obj;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0((String) this.f9099c, (Context) this.f9100d, (Uri) this.f9101e, cVar, 1);
                g0Var2.f9098b = obj;
                return g0Var2;
            case 2:
                return new g0((f1.a1) this.f9098b, (f1.a1) this.f9099c, (f1.a1) this.f9100d, (f1.a1) this.f9101e, cVar, 2);
            case 3:
                return new g0((f1.a1) this.f9098b, (f1.a1) this.f9099c, (f1.a1) this.f9100d, (q2) this.f9101e, cVar, 3);
            case 4:
                return new g0((mg.d) this.f9098b, (ra.c) this.f9099c, (String) this.f9100d, (f1.a1) this.f9101e, cVar, 4);
            default:
                g0 g0Var3 = new g0((t.c) this.f9099c, (q2) this.f9100d, (t.c) this.f9101e, cVar, 5);
                g0Var3.f9098b = obj;
                return g0Var3;
        }
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        qj.z zVar = (qj.z) obj;
        ti.c cVar = (ti.c) obj2;
        switch (this.f9097a) {
            case 0:
                g0 g0Var = (g0) create(zVar, cVar);
                pi.o oVar = pi.o.f13011a;
                g0Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                return ((g0) create(zVar, cVar)).invokeSuspend(pi.o.f13011a);
            case 2:
                g0 g0Var2 = (g0) create(zVar, cVar);
                pi.o oVar2 = pi.o.f13011a;
                g0Var2.invokeSuspend(oVar2);
                return oVar2;
            case 3:
                g0 g0Var3 = (g0) create(zVar, cVar);
                pi.o oVar3 = pi.o.f13011a;
                g0Var3.invokeSuspend(oVar3);
                return oVar3;
            case 4:
                g0 g0Var4 = (g0) create(zVar, cVar);
                pi.o oVar4 = pi.o.f13011a;
                g0Var4.invokeSuspend(oVar4);
                return oVar4;
            default:
                g0 g0Var5 = (g0) create(zVar, cVar);
                pi.o oVar5 = pi.o.f13011a;
                g0Var5.invokeSuspend(oVar5);
                return oVar5;
        }
    }

    @Override // vi.a
    public final Object invokeSuspend(Object obj) {
        Object objR;
        int i10 = this.f9097a;
        int i11 = 0;
        pi.o oVar = pi.o.f13011a;
        boolean z2 = false;
        boolean z10 = false;
        boolean z11 = false;
        Object obj2 = this.f9101e;
        Object obj3 = this.f9100d;
        Object obj4 = this.f9099c;
        switch (i10) {
            case 0:
                ui.a aVar = ui.a.f17085a;
                uk.c.R(obj);
                qj.z zVar = (qj.z) this.f9098b;
                qj.a0 a0Var = qj.a0.f13538a;
                p2.a0 a0Var2 = (p2.a0) obj4;
                qj.b0.w(zVar, null, new f0(a0Var2, (b1) obj3, z10 ? 1 : 0, i11), 1);
                qj.b0.w(zVar, null, new androidx.lifecycle.h0(a0Var2, (v0.u0) obj2, z2 ? 1 : 0, 16), 1);
                return oVar;
            case 1:
                Context context = (Context) obj3;
                ui.a aVar2 = ui.a.f17085a;
                uk.c.R(obj);
                String strI = (String) obj4;
                if (strI != null) {
                    mb.c cVar = (mb.c) mb.a.p(context).get(strI);
                    if (cVar != null) {
                        strI = t.m1.i("user:", cVar.f11441a);
                    }
                    return mb.a.n(context, strI);
                }
                Uri uri = (Uri) obj2;
                if (uri == null) {
                    return null;
                }
                try {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            Object objDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                            objR = objDecodeStream;
                        } finally {
                        }
                    } else {
                        objR = null;
                    }
                } catch (Throwable th2) {
                    objR = uk.c.r(th2);
                }
                return (Bitmap) (objR instanceof pi.j ? null : objR);
            case 2:
                ui.a aVar3 = ui.a.f17085a;
                uk.c.R(obj);
                if (ra.b.u((f1.a1) this.f9098b)) {
                    ((f1.a1) obj4).setValue(null);
                    ((f1.a1) obj3).setValue(null);
                    ra.b.e((f1.a1) obj2, false);
                }
                return oVar;
            case 3:
                f1.a1 a1Var = (f1.a1) obj3;
                ui.a aVar4 = ui.a.f17085a;
                uk.c.R(obj);
                if (!((Boolean) ((f1.a1) this.f9098b).getValue()).booleanValue() && ((ab.a) ((f1.a1) obj4).getValue()) == null && ((ab.a) a1Var.getValue()) != null && s3.f.e(((s3.f) ((q2) obj2).getValue()).f14742a, 0)) {
                    a1Var.setValue(null);
                }
                return oVar;
            case 4:
                ui.a aVar5 = ui.a.f17085a;
                uk.c.R(obj);
                ((mg.d) this.f9098b).b("devlogs").b(((ra.c) obj4).f13948a).b("userReactions").b((String) obj3).c().addOnSuccessListener(new ac.h(new ab.i((f1.a1) obj2, 27), 27));
                return oVar;
            default:
                qj.z zVar2 = (qj.z) this.f9098b;
                ui.a aVar6 = ui.a.f17085a;
                uk.c.R(obj);
                qj.b0.w(zVar2, null, new t0.f((t.c) obj4, (q2) obj3, z11 ? 1 : 0, 17), 3);
                qj.b0.w(zVar2, null, new ab.o((t.c) obj2, null, 15), 3);
                return oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, ti.c cVar, int i10) {
        super(2, cVar);
        this.f9097a = i10;
        this.f9099c = obj;
        this.f9100d = obj2;
        this.f9101e = obj3;
    }
}
