package com.google.firebase.database;

import androidx.annotation.Keep;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import jg.a;
import kg.b;
import kg.c;
import kg.j;
import l7.n;
import mg.g;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(c cVar) {
        return new g((i) cVar.a(i.class), cVar.i(a.class), cVar.i(hg.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        kg.a aVarA = b.a(g.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(j.b(i.class));
        aVarA.a(new j(0, 2, a.class));
        aVarA.a(new j(0, 2, hg.a.class));
        aVarA.f9606f = new n(5);
        return Arrays.asList(aVarA.b(), l.e(LIBRARY_NAME, "21.0.0"));
    }
}
