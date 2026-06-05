package cg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import kg.r;
import uf.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements oh.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3361c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f3359a = i10;
        this.f3360b = obj;
        this.f3361c = obj2;
    }

    @Override // oh.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f3359a) {
            case 0:
                i iVar = (i) this.f3360b;
                Context context = (Context) this.f3361c;
                String strG = iVar.g();
                th.a aVar = new th.a();
                Context contextCreateDeviceProtectedStorageContext = i4.c.createDeviceProtectedStorageContext(context);
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strG, 0);
                boolean z2 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z2 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z2 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f16330a = z2;
                return aVar;
            case 1:
                kg.g gVar = (kg.g) this.f3360b;
                kg.b bVar = (kg.b) this.f3361c;
                kg.e eVar = bVar.f9613f;
                p pVar = new p();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<kg.j> set = bVar.f9610c;
                Set set2 = bVar.f9614g;
                for (kg.j jVar : set) {
                    int i10 = jVar.f9632c;
                    int i11 = jVar.f9631b;
                    boolean z10 = i10 == 0;
                    r rVar = jVar.f9630a;
                    if (z10) {
                        if (i11 == 2) {
                            hashSet4.add(rVar);
                        } else {
                            hashSet.add(rVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(rVar);
                    } else if (i11 == 2) {
                        hashSet5.add(rVar);
                    } else {
                        hashSet2.add(rVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(r.a(ih.a.class));
                }
                pVar.f17052a = Collections.unmodifiableSet(hashSet);
                pVar.f17053b = Collections.unmodifiableSet(hashSet2);
                pVar.f17054c = Collections.unmodifiableSet(hashSet3);
                pVar.f17055d = Collections.unmodifiableSet(hashSet4);
                pVar.f17056e = Collections.unmodifiableSet(hashSet5);
                pVar.f17057f = gVar;
                return eVar.f(pVar);
            default:
                return new yh.c((Context) this.f3361c, (String) this.f3360b);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.f3359a = 2;
        this.f3361c = context;
        this.f3360b = str;
    }
}
