package mc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdc;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzdsc;
import com.google.android.gms.internal.ads.zzfha;
import com.google.android.gms.internal.ads.zzfhb;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzgdb;
import com.google.android.gms.internal.ads.zzgdm;
import java.util.ArrayList;
import nc.t;
import org.json.JSONException;
import org.json.JSONObject;
import qc.l0;
import qc.o0;
import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11544a;

    /* renamed from: b, reason: collision with root package name */
    public long f11545b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11546c;

    public e(int i10) {
        this.f11544a = i10;
        switch (i10) {
            case 1:
                this.f11545b = 0L;
                break;
        }
    }

    public static final void l(zzdsc zzdscVar, String str, long j) {
        if (zzdscVar != null) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzmR)).booleanValue()) {
                zzdsb zzdsbVarZza = zzdscVar.zza();
                zzdsbVarZza.zzb("action", "lat_init");
                zzdsbVarZza.zzb(str, Long.toString(j));
                zzdsbVarZza.zzj();
            }
        }
    }

    public void a(int i10) {
        if (i10 < 64) {
            this.f11545b &= ~(1 << i10);
            return;
        }
        e eVar = (e) this.f11546c;
        if (eVar != null) {
            eVar.a(i10 - 64);
        }
    }

    public int b(int i10) {
        e eVar = (e) this.f11546c;
        if (eVar == null) {
            return i10 >= 64 ? Long.bitCount(this.f11545b) : Long.bitCount(this.f11545b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f11545b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f11545b) + eVar.b(i10 - 64);
    }

    public void c() {
        if (((e) this.f11546c) == null) {
            this.f11546c = new e(1);
        }
    }

    public boolean d(int i10) {
        if (i10 < 64) {
            return (this.f11545b & (1 << i10)) != 0;
        }
        c();
        return ((e) this.f11546c).d(i10 - 64);
    }

    public long e(float f10, long j, boolean z2) {
        long jF;
        if (z2) {
            jF = b2.b.f(this.f11545b, j);
            this.f11545b = jF;
        } else {
            jF = b2.b.f(this.f11545b, j);
        }
        if ((((o1) this.f11546c) == null ? b2.b.d(jF) : Math.abs(g(jF))) < f10) {
            return 9205357640488583168L;
        }
        if (((o1) this.f11546c) == null) {
            long j4 = this.f11545b;
            return b2.b.e(this.f11545b, b2.b.g(b2.b.b(j4, b2.b.d(j4)), f10));
        }
        float fG = g(this.f11545b) - (Math.signum(g(this.f11545b)) * f10);
        long j10 = this.f11545b;
        o1 o1Var = (o1) this.f11546c;
        o1 o1Var2 = o1.f19665b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (o1Var == o1Var2 ? j10 & 4294967295L : j10 >> 32));
        if (((o1) this.f11546c) == o1Var2) {
            return (Float.floatToRawIntBits(fG) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fG) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public void f(int i10, boolean z2) {
        if (i10 >= 64) {
            c();
            ((e) this.f11546c).f(i10 - 64, z2);
            return;
        }
        long j = this.f11545b;
        boolean z10 = (Long.MIN_VALUE & j) != 0;
        long j4 = (1 << i10) - 1;
        this.f11545b = ((j & (~j4)) << 1) | (j & j4);
        if (z2) {
            j(i10);
        } else {
            a(i10);
        }
        if (z10 || ((e) this.f11546c) != null) {
            c();
            ((e) this.f11546c).f(0, z10);
        }
    }

    public float g(long j) {
        return Float.intBitsToFloat((int) (((o1) this.f11546c) == o1.f19665b ? j >> 32 : j & 4294967295L));
    }

    public boolean h(int i10) {
        if (i10 >= 64) {
            c();
            return ((e) this.f11546c).h(i10 - 64);
        }
        long j = 1 << i10;
        long j4 = this.f11545b;
        boolean z2 = (j4 & j) != 0;
        long j10 = j4 & (~j);
        this.f11545b = j10;
        long j11 = j - 1;
        this.f11545b = (j10 & j11) | Long.rotateRight((~j11) & j10, 1);
        e eVar = (e) this.f11546c;
        if (eVar != null) {
            if (eVar.d(0)) {
                j(63);
            }
            ((e) this.f11546c).h(0);
        }
        return z2;
    }

    public void i() {
        this.f11545b = 0L;
        e eVar = (e) this.f11546c;
        if (eVar != null) {
            eVar.i();
        }
    }

    public void j(int i10) {
        if (i10 < 64) {
            this.f11545b |= 1 << i10;
        } else {
            c();
            ((e) this.f11546c).j(i10 - 64);
        }
    }

    public void k(Context context, rc.a aVar, boolean z2, zzbzk zzbzkVar, String str, String str2, Runnable runnable, zzfhp zzfhpVar, final zzdsc zzdscVar, final Long l10, boolean z10) throws JSONException {
        zzfhb zzfhbVar;
        Exception exc;
        JSONObject jSONObject;
        PackageInfo packageInfoD;
        final zzfhp zzfhpVar2 = zzfhpVar;
        n nVar = n.D;
        ud.b bVar = nVar.f11584k;
        ud.b bVar2 = nVar.f11584k;
        bVar.getClass();
        if (SystemClock.elapsedRealtime() - this.f11545b < 5000) {
            int i10 = l0.f13401b;
            rc.k.g("Not retrying to fetch app settings");
            return;
        }
        bVar2.getClass();
        this.f11545b = SystemClock.elapsedRealtime();
        if (zzbzkVar != null && !TextUtils.isEmpty(zzbzkVar.zzc())) {
            long jZza = zzbzkVar.zza();
            bVar2.getClass();
            if (System.currentTimeMillis() - jZza <= ((Long) t.f12227d.f12230c.zzb(zzbdc.zzer)).longValue() && zzbzkVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            int i11 = l0.f13401b;
            rc.k.g("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i12 = l0.f13401b;
            rc.k.g("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f11546c = applicationContext;
        final zzfhb zzfhbVarZza = zzfha.zza(context, 4);
        zzfhbVarZza.zzi();
        zzbou zzbouVarZza = nVar.f11591r.zza((Context) this.f11546c, aVar, zzfhpVar2);
        zzboo zzbooVar = zzbor.zza;
        zzbok zzbokVarZza = zzbouVarZza.zza("google.afma.config.fetchAppSettings", zzbooVar, zzbooVar);
        try {
            jSONObject = new JSONObject();
        } catch (Exception e10) {
            e = e10;
            zzfhbVar = zzfhbVarZza;
            exc = e;
            int i13 = l0.f13401b;
            rc.k.e("Error requesting application settings", exc);
            zzfhbVar.zzh(exc);
            zzfhbVar.zzg(false);
            zzfhpVar2.zzc(zzfhbVar.zzm());
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z2);
            jSONObject.put("pn", context.getPackageName());
            zzbct zzbctVar = zzbdc.zza;
            t tVar = t.f12227d;
            jSONObject.put("experiment_ids", TextUtils.join(",", tVar.f12228a.zza()));
            jSONObject.put("js", aVar.f14321a);
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzjL)).booleanValue()) {
                jSONObject.put("inspector_enabled", z10);
            }
            try {
                ApplicationInfo applicationInfo = ((Context) this.f11546c).getApplicationInfo();
                if (applicationInfo != null && (packageInfoD = wd.b.a(context).d(0, applicationInfo.packageName)) != null) {
                    jSONObject.put("version", packageInfoD.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                l0.k("Error fetching PackageInfo.");
            }
            mf.a aVarZzb = zzbokVarZza.zzb(jSONObject);
            try {
                zzgci zzgciVar = new zzgci(this) { // from class: mc.d
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) throws JSONException {
                        Long l11 = l10;
                        zzdsc zzdscVar2 = zzdscVar;
                        zzfhb zzfhbVar2 = zzfhbVarZza;
                        zzfhp zzfhpVar3 = zzfhpVar2;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        int i14 = 0;
                        boolean zOptBoolean = jSONObject2.optBoolean("isSuccessful", false);
                        if (zOptBoolean) {
                            String string = jSONObject2.getString("appSettingsJson");
                            n nVar2 = n.D;
                            o0 o0Var = (o0) nVar2.f11582h.zzi();
                            o0Var.l();
                            synchronized (o0Var.f13414a) {
                                try {
                                    nVar2.f11584k.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (string == null || string.equals(o0Var.f13426n.zzc())) {
                                        o0Var.f13426n.zzg(jCurrentTimeMillis);
                                    } else {
                                        o0Var.f13426n = new zzbzk(string, jCurrentTimeMillis);
                                        SharedPreferences.Editor editor = o0Var.f13420g;
                                        if (editor != null) {
                                            editor.putString("app_settings_json", string);
                                            o0Var.f13420g.putLong("app_settings_last_update_ms", jCurrentTimeMillis);
                                            o0Var.f13420g.apply();
                                        }
                                        o0Var.m();
                                        ArrayList arrayList = o0Var.f13416c;
                                        int size = arrayList.size();
                                        while (i14 < size) {
                                            Object obj2 = arrayList.get(i14);
                                            i14++;
                                            ((Runnable) obj2).run();
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (l11 != null) {
                                n.D.f11584k.getClass();
                                e.l(zzdscVar2, "cld_s", SystemClock.elapsedRealtime() - l11.longValue());
                            }
                        }
                        String strOptString = jSONObject2.optString("errorMessage", "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            zzfhbVar2.zzc(strOptString);
                        }
                        zzfhbVar2.zzg(zOptBoolean);
                        zzfhpVar3.zzc(zzfhbVar2.zzm());
                        return zzgdb.zzh(null);
                    }
                };
                zzfhbVar = zzfhbVarZza;
                zzfhpVar2 = zzfhpVar2;
                try {
                    zzgdm zzgdmVar = zzcad.zzg;
                    mf.a aVarZzn = zzgdb.zzn(aVarZzb, zzgciVar, zzgdmVar);
                    if (runnable != null) {
                        aVarZzb.addListener(runnable, zzgdmVar);
                    }
                    if (l10 != null) {
                        aVarZzb.addListener(new a8.e(this, zzdscVar, l10), zzgdmVar);
                    }
                    if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhU)).booleanValue()) {
                        zzcag.zzb(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
                    } else {
                        zzcag.zza(aVarZzn, "ConfigLoader.maybeFetchNewAppSettings");
                    }
                } catch (Exception e11) {
                    e = e11;
                    exc = e;
                    int i132 = l0.f13401b;
                    rc.k.e("Error requesting application settings", exc);
                    zzfhbVar.zzh(exc);
                    zzfhbVar.zzg(false);
                    zzfhpVar2.zzc(zzfhbVar.zzm());
                }
            } catch (Exception e12) {
                e = e12;
                zzfhbVar = zzfhbVarZza;
                zzfhpVar2 = zzfhpVar2;
            }
        } catch (Exception e13) {
            exc = e13;
            zzfhbVar = zzfhbVarZza;
            int i1322 = l0.f13401b;
            rc.k.e("Error requesting application settings", exc);
            zzfhbVar.zzh(exc);
            zzfhbVar.zzg(false);
            zzfhpVar2.zzc(zzfhbVar.zzm());
        }
    }

    public String toString() {
        switch (this.f11544a) {
            case 1:
                if (((e) this.f11546c) == null) {
                    return Long.toBinaryString(this.f11545b);
                }
                return ((e) this.f11546c).toString() + "xx" + Long.toBinaryString(this.f11545b);
            default:
                return super.toString();
        }
    }

    public e(long j, o1 o1Var) {
        this.f11544a = 2;
        this.f11546c = o1Var;
        this.f11545b = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o1 o1Var) {
        this(0L, o1Var);
        this.f11544a = 2;
    }
}
