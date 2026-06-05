package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kg.b;
import kg.c;
import kg.j;
import kg.r;
import rb.f;
import sb.a;
import u0.l;
import ub.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f14961f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f14961f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(c cVar) {
        p.b((Context) cVar.a(Context.class));
        return p.a().c(a.f14960e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        kg.a aVarA = b.a(f.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(j.b(Context.class));
        aVarA.f9606f = new b0.b(8);
        b bVarB = aVarA.b();
        kg.a aVarB = b.b(new r(ch.a.class, f.class));
        aVarB.a(j.b(Context.class));
        aVarB.f9606f = new b0.b(9);
        b bVarB2 = aVarB.b();
        kg.a aVarB2 = b.b(new r(ch.b.class, f.class));
        aVarB2.a(j.b(Context.class));
        aVarB2.f9606f = new b0.b(10);
        return Arrays.asList(bVarB, bVarB2, aVarB2.b(), l.e(LIBRARY_NAME, "18.2.0"));
    }
}
