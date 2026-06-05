package com.google.firebase.installations;

import ac.h;
import androidx.annotation.Keep;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import gg.a;
import gg.b;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kg.c;
import kg.j;
import kg.r;
import l7.n;
import lg.k;
import lh.e;
import lh.f;
import ph.d;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(c cVar) {
        return new ph.c((i) cVar.a(i.class), cVar.b(f.class), (ExecutorService) cVar.f(new r(a.class, ExecutorService.class)), new k((Executor) cVar.f(new r(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kg.b> getComponents() {
        kg.a aVarA = kg.b.a(d.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(j.b(i.class));
        aVarA.a(j.a(f.class));
        aVarA.a(new j(new r(a.class, ExecutorService.class), 1, 0));
        aVarA.a(new j(new r(b.class, Executor.class), 1, 0));
        aVarA.f9606f = new n(17);
        kg.b bVarB = aVarA.b();
        e eVar = new e();
        kg.a aVarA2 = kg.b.a(e.class);
        aVarA2.f9605e = 1;
        aVarA2.f9606f = new h(eVar, 14);
        return Arrays.asList(bVarB, aVarA2.b(), l.e(LIBRARY_NAME, "18.0.0"));
    }
}
