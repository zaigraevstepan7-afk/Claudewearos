package com.google.firebase.functions;

import a8.j;
import ac.l;
import ag.i;
import ak.v;
import android.content.Context;
import androidx.annotation.Keep;
import cg.m;
import com.google.firebase.components.ComponentRegistrar;
import gg.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import jh.f;
import jh.g;
import kg.c;
import kg.p;
import kg.r;
import kh.a;
import oh.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class FunctionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fn";

    /* JADX INFO: Access modifiers changed from: private */
    public static f lambda$getComponents$0(r rVar, r rVar2, c cVar) {
        Object obj = a.f9647c;
        Context context = (Context) cVar.a(Context.class);
        context.getClass();
        m mVar = (m) cVar.a(m.class);
        mVar.getClass();
        Executor executor = (Executor) cVar.f(rVar);
        executor.getClass();
        Executor executor2 = (Executor) cVar.f(rVar2);
        executor2.getClass();
        b bVarB = cVar.b(jg.a.class);
        bVarB.getClass();
        b bVarB2 = cVar.b(nh.a.class);
        bVarB2.getClass();
        p pVarI = cVar.i(hg.a.class);
        pVarI.getClass();
        i iVarB = i.B(context);
        ld.i iVar = new ld.i(i.B(mVar), 10);
        i iVarB2 = i.B(bVarB);
        i iVarB3 = i.B(bVarB2);
        i iVarB4 = i.B(pVarI);
        i iVarB5 = i.B(executor);
        j jVar = new j(iVarB2, iVarB3, iVarB4, iVarB5);
        a aVar = new a();
        aVar.f9649b = obj;
        aVar.f9648a = jVar;
        i iVar2 = new i(i.B(new g(new v(iVarB, iVar, aVar, iVarB5, i.B(executor2)))), 9);
        a aVar2 = new a();
        aVar2.f9649b = obj;
        aVar2.f9648a = iVar2;
        return (f) aVar2.get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kg.b> getComponents() {
        r rVar = new r(gg.c.class, Executor.class);
        r rVar2 = new r(d.class, Executor.class);
        kg.a aVarA = kg.b.a(f.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(kg.j.b(Context.class));
        aVarA.a(kg.j.b(m.class));
        aVarA.a(kg.j.a(jg.a.class));
        aVarA.a(new kg.j(1, 1, nh.a.class));
        aVarA.a(new kg.j(0, 2, hg.a.class));
        aVarA.a(new kg.j(rVar, 1, 0));
        aVarA.a(new kg.j(rVar2, 1, 0));
        aVarA.f9606f = new l(9, rVar, rVar2);
        return Arrays.asList(aVarA.b(), u0.l.e(LIBRARY_NAME, "21.0.0"));
    }
}
