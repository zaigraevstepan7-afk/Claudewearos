package i6;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import w5.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8355e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static b f8356f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8357a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8358b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8359c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8360d = new ArrayList();

    public b(Context context) {
        this.f8357a = context;
        new a(this, context.getMainLooper());
    }

    public static b a(w wVar) {
        b bVar;
        synchronized (f8355e) {
            try {
                if (f8356f == null) {
                    f8356f = new b(wVar.getApplicationContext());
                }
                bVar = f8356f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final void b(Intent intent) {
        synchronized (this.f8358b) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f8357a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z2 = (intent.getFlags() & 8) != 0;
                if (z2) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f8359c.get(intent.getAction());
                if (arrayList != null) {
                    if (z2) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z2) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
