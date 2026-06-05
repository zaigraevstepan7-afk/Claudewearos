package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t f4195b = new t(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4196a;

    public l0(l lVar) {
        a0.a(lVar, "output");
        this.f4196a = lVar;
        lVar.f4191d = this;
    }

    public void a(int i10, i iVar) {
        l lVar = (l) this.f4196a;
        lVar.r0(i10, 2);
        lVar.s0(iVar.size());
        h hVar = (h) iVar;
        lVar.l0(hVar.f4169d, hVar.y(), hVar.size());
    }

    public void b(int i10, Object obj, b1 b1Var) throws androidx.datastore.preferences.protobuf.l {
        l lVar = (l) this.f4196a;
        lVar.r0(i10, 3);
        b1Var.i((a) obj, lVar.f4191d);
        lVar.r0(i10, 4);
    }

    public void c(int i10, Object obj, b1 b1Var) throws androidx.datastore.preferences.protobuf.l {
        l lVar = (l) this.f4196a;
        a aVar = (a) obj;
        lVar.r0(i10, 2);
        lVar.s0(aVar.b(b1Var));
        b1Var.i(aVar, lVar.f4191d);
    }

    public l0() {
        p0 p0Var;
        try {
            p0Var = (p0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p0Var = f4195b;
        }
        p0[] p0VarArr = {t.f4237b, p0Var};
        k0 k0Var = new k0();
        k0Var.f4187a = p0VarArr;
        Charset charset = a0.f4133a;
        this.f4196a = k0Var;
    }
}
