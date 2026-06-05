package xc;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbda;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzdsh;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f19968a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f19971d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f19972e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f19973f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f19974g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final zzdsh f19975h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f19976i;

    public l0(zzdsh zzdshVar) {
        this.f19975h = zzdshVar;
        zzbct zzbctVar = zzbdc.zzgZ;
        nc.t tVar = nc.t.f12227d;
        this.f19968a = ((Integer) tVar.f12230c.zzb(zzbctVar)).intValue();
        zzbct zzbctVar2 = zzbdc.zzha;
        zzbda zzbdaVar = tVar.f12230c;
        this.f19969b = ((Long) zzbdaVar.zzb(zzbctVar2)).longValue();
        this.f19970c = ((Boolean) zzbdaVar.zzb(zzbdc.zzhe)).booleanValue();
        this.f19971d = ((Boolean) zzbdaVar.zzb(zzbdc.zzhd)).booleanValue();
        this.f19972e = Collections.synchronizedMap(new j0(this));
    }

    public final synchronized String a(String str, zzdrw zzdrwVar) {
        k0 k0Var = (k0) this.f19972e.get(str);
        zzdrwVar.zzb().put("request_id", str);
        if (k0Var == null) {
            zzdrwVar.zzb().put("mhit", "false");
            return null;
        }
        zzdrwVar.zzb().put("mhit", "true");
        return k0Var.f19956b;
    }

    public final synchronized void b(String str, String str2, zzdrw zzdrwVar) {
        mc.n.D.f11584k.getClass();
        this.f19972e.put(str, new k0(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        e();
        c(zzdrwVar);
    }

    public final synchronized void c(zzdrw zzdrwVar) throws Throwable {
        try {
            try {
                if (this.f19970c) {
                    ArrayDeque arrayDeque = this.f19974g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f19973f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    zzcad.zza.execute(new ad.f(this, zzdrwVar, arrayDequeClone, arrayDequeClone2, 9));
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void d(zzdrw zzdrwVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrwVar.zzb());
            this.f19976i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f19976i.put("e_r", str);
            this.f19976i.put("e_id", (String) pair2.first);
            if (this.f19971d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(u3.c.v(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f19976i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f19976i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f19975h.zzg(this.f19976i);
        }
    }

    public final synchronized void e() {
        mc.n.D.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f19972e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((k0) entry.getValue()).f19955a.longValue() <= this.f19969b) {
                    break;
                }
                this.f19974g.add(new Pair((String) entry.getKey(), ((k0) entry.getValue()).f19956b));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            mc.n.D.f11582h.zzw(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }
}
