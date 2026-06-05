package xc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f19900a;

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f19901b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f19902c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19903d = new Object();

    public a0(Context context) {
        this.f19902c = context;
    }

    public final String a(String str) {
        String string;
        e();
        synchronized (this.f19903d) {
            string = this.f19900a.getString(str, null);
            this.f19901b.remove(str).commit();
        }
        return string;
    }

    public final HashMap b() {
        HashMap map;
        e();
        synchronized (this.f19903d) {
            try {
                Map<String, ?> all = this.f19900a.getAll();
                map = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        map.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public final void c() {
        e();
        synchronized (this.f19903d) {
            this.f19901b.clear().commit();
        }
    }

    public final void d(int i10, int i11, String str) {
        String str2 = Build.MODEL;
        e();
        synchronized (this.f19903d) {
            this.f19901b.putString("pn", str).putInt("vc", i10).putString("dm", str2).putInt("aav", i11).commit();
        }
    }

    public final void e() {
        synchronized (this.f19903d) {
            try {
                if (this.f19900a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f19902c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f19900a = sharedPreferences;
                this.f19901b = sharedPreferences.edit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
