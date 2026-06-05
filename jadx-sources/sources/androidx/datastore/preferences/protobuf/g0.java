package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f931b = new t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f932a;

    public g0(m mVar) {
        y.a(mVar, "output");
        this.f932a = mVar;
        mVar.f969d = this;
    }

    public void a(int i10, Object obj, x0 x0Var) {
        m mVar = (m) this.f932a;
        mVar.v0(i10, 3);
        x0Var.e((a) obj, mVar.f969d);
        mVar.v0(i10, 4);
    }

    public g0() {
        m0 m0Var;
        u0 u0Var = u0.f1025c;
        try {
            m0Var = (m0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            m0Var = f931b;
        }
        m0[] m0VarArr = {t.f1014b, m0Var};
        f0 f0Var = new f0();
        f0Var.f926a = m0VarArr;
        Charset charset = y.f1035a;
        this.f932a = f0Var;
    }
}
