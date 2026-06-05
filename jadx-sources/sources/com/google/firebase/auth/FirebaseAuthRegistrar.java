package com.google.firebase.auth;

import ac.h;
import ak.v;
import androidx.annotation.Keep;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import gg.d;
import hg.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kg.c;
import kg.j;
import kg.r;
import lh.e;
import lh.f;
import oh.b;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static FirebaseAuth lambda$getComponents$0(r rVar, r rVar2, r rVar3, r rVar4, r rVar5, c cVar) {
        i iVar = (i) cVar.a(i.class);
        b bVarB = cVar.b(a.class);
        b bVarB2 = cVar.b(f.class);
        return new jg.b(iVar, bVarB, bVarB2, (Executor) cVar.f(rVar2), (Executor) cVar.f(rVar3), (ScheduledExecutorService) cVar.f(rVar4), (Executor) cVar.f(rVar5));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kg.b> getComponents() {
        r rVar = new r(gg.a.class, Executor.class);
        r rVar2 = new r(gg.b.class, Executor.class);
        r rVar3 = new r(gg.c.class, Executor.class);
        r rVar4 = new r(gg.c.class, ScheduledExecutorService.class);
        r rVar5 = new r(d.class, Executor.class);
        kg.a aVar = new kg.a(FirebaseAuth.class, new Class[]{jg.a.class});
        aVar.a(j.b(i.class));
        aVar.a(new j(1, 1, f.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.a(new j(rVar2, 1, 0));
        aVar.a(new j(rVar3, 1, 0));
        aVar.a(new j(rVar4, 1, 0));
        aVar.a(new j(rVar5, 1, 0));
        aVar.a(j.a(a.class));
        v vVar = new v();
        vVar.f730a = rVar;
        vVar.f731b = rVar2;
        vVar.f732c = rVar3;
        vVar.f733d = rVar4;
        vVar.f734e = rVar5;
        aVar.f9606f = vVar;
        kg.b bVarB = aVar.b();
        e eVar = new e();
        kg.a aVarA = kg.b.a(e.class);
        aVarA.f9605e = 1;
        aVarA.f9606f = new h(eVar, 14);
        return Arrays.asList(bVarB, aVarA.b(), l.e("fire-auth", "23.0.0"));
    }
}
