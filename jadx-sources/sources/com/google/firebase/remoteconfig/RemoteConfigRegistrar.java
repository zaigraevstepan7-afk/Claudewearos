package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import eg.a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kg.b;
import kg.c;
import kg.j;
import kg.r;
import ph.d;
import u0.l;
import zh.i;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static i lambda$getComponents$0(r rVar, c cVar) {
        dg.c cVar2;
        Context context = (Context) cVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) cVar.f(rVar);
        cg.i iVar = (cg.i) cVar.a(cg.i.class);
        d dVar = (d) cVar.a(d.class);
        a aVar = (a) cVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f6078a.containsKey("frc")) {
                    aVar.f6078a.put("frc", new dg.c(aVar.f6079b));
                }
                cVar2 = (dg.c) aVar.f6078a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new i(context, scheduledExecutorService, iVar, dVar, cVar2, cVar.b(fg.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        r rVar = new r(gg.b.class, ScheduledExecutorService.class);
        kg.a aVar = new kg.a(i.class, new Class[]{ci.a.class});
        aVar.f9601a = LIBRARY_NAME;
        aVar.a(j.b(Context.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.a(j.b(cg.i.class));
        aVar.a(j.b(d.class));
        aVar.a(j.b(a.class));
        aVar.a(j.a(fg.a.class));
        aVar.f9606f = new lh.b(rVar, 2);
        aVar.c(2);
        return Arrays.asList(aVar.b(), l.e(LIBRARY_NAME, "22.0.0"));
    }
}
