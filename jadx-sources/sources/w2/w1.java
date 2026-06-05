package w2;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 implements v1.p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18446a;

    /* renamed from: b, reason: collision with root package name */
    public vj.d f18447b;

    /* renamed from: c, reason: collision with root package name */
    public final f1.f1 f18448c = new f1.f1(1.0f);

    /* renamed from: d, reason: collision with root package name */
    public qj.s1 f18449d;

    public w1(Context context) {
        this.f18446a = context;
    }

    @Override // ti.h
    public final ti.f C(ti.g gVar) {
        return yd.f.w(this, gVar);
    }

    @Override // v1.p
    public final float D() {
        ti.c cVar;
        tj.p0 p0Var;
        if (this.f18449d == null) {
            Context context = this.f18446a;
            q.g0 g0Var = s2.f18375a;
            synchronized (g0Var) {
                try {
                    Object objG = g0Var.g(context);
                    cVar = null;
                    if (objG == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        sj.c cVarA = u6.v.a(-1, 6, null);
                        m5.n nVar = new m5.n(new d1.m0(contentResolver, uriFor, new r2(cVarA, wd.a.u(Looper.getMainLooper())), cVarA, context, null));
                        qj.u1 u1VarC = qj.b0.c();
                        xj.e eVar = qj.m0.f13601a;
                        objG = tj.i0.m(nVar, new vj.d(yd.f.W(u1VarC, vj.n.f18117a)), new tj.o0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        g0Var.m(context, objG);
                    }
                    p0Var = (tj.p0) objG;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f18448c.h(((Number) p0Var.getValue()).floatValue());
            vj.d dVar = this.f18447b;
            if (dVar == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.f18449d = qj.b0.w(dVar, null, new t0.f(p0Var, this, cVar, 10), 3);
        }
        return this.f18448c.g();
    }

    @Override // ti.h
    public final Object F(ej.e eVar, Object obj) {
        return eVar.invoke(obj, this);
    }

    @Override // ti.h
    public final ti.h V(ti.h hVar) {
        return yd.f.W(this, hVar);
    }

    @Override // ti.h
    public final ti.h s(ti.g gVar) {
        return yd.f.N(this, gVar);
    }
}
