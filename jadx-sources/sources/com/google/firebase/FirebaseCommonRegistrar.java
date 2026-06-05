package com.google.firebase;

import android.content.Context;
import android.os.Build;
import cg.i;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kg.a;
import kg.b;
import kg.j;
import kg.r;
import lh.d;
import lh.e;
import lh.f;
import lh.g;
import u0.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        a aVarA = b.a(yh.b.class);
        aVarA.a(new j(2, 0, yh.a.class));
        aVarA.f9606f = new vf.j(7);
        arrayList.add(aVarA.b());
        r rVar = new r(gg.a.class, Executor.class);
        a aVar = new a(d.class, new Class[]{f.class, g.class});
        aVar.a(j.b(Context.class));
        aVar.a(j.b(i.class));
        aVar.a(new j(2, 0, e.class));
        aVar.a(new j(1, 1, yh.b.class));
        aVar.a(new j(rVar, 1, 0));
        aVar.f9606f = new lh.b(rVar, 0);
        arrayList.add(aVar.b());
        arrayList.add(l.e("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(l.e("fire-core", "21.0.0"));
        arrayList.add(l.e("device-name", a(Build.PRODUCT)));
        arrayList.add(l.e("device-model", a(Build.DEVICE)));
        arrayList.add(l.e("device-brand", a(Build.BRAND)));
        arrayList.add(l.g("android-target-sdk", new b0.b(4)));
        arrayList.add(l.g("android-min-sdk", new b0.b(5)));
        arrayList.add(l.g("android-platform", new b0.b(6)));
        arrayList.add(l.g("android-installer", new b0.b(7)));
        try {
            pi.d.f12995b.getClass();
            str = "2.3.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(l.e("kotlin", str));
        }
        return arrayList;
    }
}
