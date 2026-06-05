package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import eg.a;
import java.util.Arrays;
import java.util.List;
import kg.b;
import kg.c;
import kg.j;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(c cVar) {
        return new a((Context) cVar.a(Context.class), cVar.b(fg.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        kg.a aVarA = b.a(a.class);
        aVarA.f9601a = LIBRARY_NAME;
        aVarA.a(j.b(Context.class));
        aVarA.a(j.a(fg.a.class));
        aVarA.f9606f = new b0.b(18);
        return Arrays.asList(aVarA.b(), l.e(LIBRARY_NAME, "21.1.1"));
    }
}
