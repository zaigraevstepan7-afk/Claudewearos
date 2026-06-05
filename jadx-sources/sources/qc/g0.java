package qc;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13361a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13362b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f13363c;

    public g0(Context context) {
        this.f13363c = context;
    }

    public final void a() {
        zzbct zzbctVar = zzbdc.zzkG;
        nc.t tVar = nc.t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            r0 r0Var = mc.n.D.f11577c;
            HashMap mapJ = r0.J((String) tVar.f12230c.zzb(zzbdc.zzkL));
            for (String str : mapJ.keySet()) {
                synchronized (this) {
                    try {
                        HashMap map = this.f13361a;
                        if (!map.containsKey(str)) {
                            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f13363c) : this.f13363c.getSharedPreferences(str, 0);
                            f0 f0Var = new f0(this, str);
                            map.put(str, f0Var);
                            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(f0Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            e0 e0Var = new e0(mapJ);
            synchronized (this) {
                this.f13362b.add(e0Var);
            }
        }
    }
}
