package com.google.firebase.messaging;

import androidx.annotation.Keep;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kg.c;
import kg.j;
import kg.r;
import lh.g;
import nh.a;
import ph.d;
import rb.f;
import u0.l;
import yh.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(r rVar, c cVar) {
        return new FirebaseMessaging((i) cVar.a(i.class), (a) cVar.a(a.class), cVar.b(b.class), cVar.b(g.class), (d) cVar.a(d.class), cVar.e(rVar), (ih.b) cVar.a(ih.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kg.b> getComponents() {
        r rVar = new r(ch.b.class, f.class);
        kg.a aVarA = kg.b.a(FirebaseMessaging.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(j.b(i.class));
        aVarA.a(new j(0, 0, a.class));
        aVarA.a(j.a(b.class));
        aVarA.a(j.a(g.class));
        aVarA.a(j.b(d.class));
        aVarA.a(new j(rVar, 0, 1));
        aVarA.a(j.b(ih.b.class));
        aVarA.f9606f = new lh.b(rVar, 1);
        aVarA.c(1);
        return Arrays.asList(aVarA.b(), l.e(LIBRARY_NAME, "24.0.0"));
    }
}
