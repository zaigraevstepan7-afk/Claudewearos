package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gg.c;
import gg.d;
import java.util.List;
import java.util.concurrent.Executor;
import kg.b;
import kg.j;
import kg.r;
import pi.a;
import qi.k;
import qj.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
@a
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        kg.a aVarB = b.b(new r(gg.a.class, v.class));
        aVarB.a(new j(new r(gg.a.class, Executor.class), 1, 0));
        aVarB.f9606f = vh.a.f18073b;
        b bVarB = aVarB.b();
        kg.a aVarB2 = b.b(new r(c.class, v.class));
        aVarB2.a(new j(new r(c.class, Executor.class), 1, 0));
        aVarB2.f9606f = vh.a.f18074c;
        b bVarB2 = aVarB2.b();
        kg.a aVarB3 = b.b(new r(gg.b.class, v.class));
        aVarB3.a(new j(new r(gg.b.class, Executor.class), 1, 0));
        aVarB3.f9606f = vh.a.f18075d;
        b bVarB3 = aVarB3.b();
        kg.a aVarB4 = b.b(new r(d.class, v.class));
        aVarB4.a(new j(new r(d.class, Executor.class), 1, 0));
        aVarB4.f9606f = vh.a.f18076e;
        return k.c0(new b[]{bVarB, bVarB2, bVarB3, aVarB4.b()});
    }
}
