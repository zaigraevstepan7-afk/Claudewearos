package com.google.firebase.iid;

import androidx.annotation.Keep;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import kg.c;
import kg.j;
import lh.g;
import mh.e;
import mh.f;
import nh.a;
import ph.d;
import u0.l;
import yh.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public final class Registrar implements ComponentRegistrar {
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(c cVar) {
        return new FirebaseInstanceId((i) cVar.a(i.class), cVar.b(b.class), cVar.b(g.class), (d) cVar.a(d.class));
    }

    public static final /* synthetic */ a lambda$getComponents$1$Registrar(c cVar) {
        return new f((FirebaseInstanceId) cVar.a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<kg.b> getComponents() {
        kg.a aVarA = kg.b.a(FirebaseInstanceId.class);
        aVarA.a(j.b(i.class));
        aVarA.a(j.a(b.class));
        aVarA.a(j.a(g.class));
        aVarA.a(j.b(d.class));
        aVarA.f9606f = e.f11700b;
        aVarA.c(1);
        kg.b bVarB = aVarA.b();
        kg.a aVarA2 = kg.b.a(a.class);
        aVarA2.a(j.b(FirebaseInstanceId.class));
        aVarA2.f9606f = e.f11701c;
        return Arrays.asList(bVarB, aVarA2.b(), l.e("fire-iid", "21.1.0"));
    }
}
