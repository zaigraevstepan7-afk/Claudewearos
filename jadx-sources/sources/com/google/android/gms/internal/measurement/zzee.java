package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.common.internal.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ud.a;
import ud.b;
import yd.e;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzee {
    private static volatile zzee zzc;
    protected final a zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final fe.a zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcc zzj;

    public zzee(Context context, String str, String str2, String str3, Bundle bundle) throws Resources.NotFoundException {
        String packageName;
        String packageName2;
        String string;
        if (str == null || !zzV(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = b.f16982a;
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new fe.a();
        this.zzf = new ArrayList();
        try {
            try {
                packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(packageName)) {
                try {
                    packageName2 = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                } catch (Resources.NotFoundException unused2) {
                    packageName2 = context.getPackageName();
                }
                packageName = packageName2;
            }
            int identifier = resources.getIdentifier("google_app_id", "string", packageName);
            if (identifier == 0) {
                string = null;
                if (string != null && !zzR()) {
                    this.zzi = null;
                    this.zzh = true;
                    Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            } else {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused3) {
                }
                if (string != null) {
                    this.zzi = null;
                    this.zzh = true;
                    Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused4) {
        }
        if (zzV(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str3 == null) ^ (str2 == null)) {
                    Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        zzU(new zzcx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzed(this));
        }
    }

    public static final boolean zzR() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzS(Exception exc, boolean z2, boolean z10) {
        zzee zzeeVar;
        Exception exc2;
        this.zzh |= z2;
        if (z2) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            zzeeVar = this;
            exc2 = exc;
            zzeeVar.zzA(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            zzeeVar = this;
            exc2 = exc;
        }
        Log.w(zzeeVar.zzd, "Error with data collection. Data lost.", exc2);
    }

    private final void zzT(String str, String str2, Bundle bundle, boolean z2, boolean z10, Long l10) {
        zzU(new zzdr(this, l10, str, str2, bundle, z2, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(zzdt zzdtVar) {
        this.zzb.execute(zzdtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzV(String str, String str2) {
        return (str2 == null || str == null || zzR()) ? false : true;
    }

    public static zzee zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        e0.i(context);
        if (zzc == null) {
            synchronized (zzee.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzee(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public final void zzA(int i10, String str, Object obj, Object obj2, Object obj3) {
        zzU(new zzdg(this, false, 5, str, obj, null, null));
    }

    public final void zzB(ge.b bVar) {
        e0.i(bVar);
        synchronized (this.zzf) {
            for (int i10 = 0; i10 < this.zzf.size(); i10++) {
                try {
                    if (bVar.equals(((Pair) this.zzf.get(i10)).first)) {
                        Log.w(this.zzd, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zzdv zzdvVar = new zzdv(bVar);
            this.zzf.add(new Pair(bVar, zzdvVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdp(this, zzdvVar));
        }
    }

    public final void zzC() {
        zzU(new zzcv(this));
    }

    public final void zzD(Bundle bundle) {
        zzU(new zzcn(this, bundle));
    }

    public final void zzE(Bundle bundle) {
        zzU(new zzct(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        zzU(new zzcu(this, bundle));
    }

    public final void zzG(Activity activity, String str, String str2) {
        zzU(new zzcr(this, activity, str, str2));
    }

    public final void zzH(boolean z2) {
        zzU(new zzdm(this, z2));
    }

    public final void zzI(Bundle bundle) {
        zzU(new zzdn(this, bundle));
    }

    public final void zzJ(ge.a aVar) {
        zzdu zzduVar = new zzdu(aVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzduVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzU(new zzdo(this, zzduVar));
    }

    public final void zzK(Boolean bool) {
        zzU(new zzcs(this, bool));
    }

    public final void zzL(long j) {
        zzU(new zzcw(this, j));
    }

    public final void zzM(String str) {
        zzU(new zzcq(this, str));
    }

    public final void zzN(String str, String str2, Object obj, boolean z2) {
        zzU(new zzds(this, str, str2, obj, z2));
    }

    public final void zzO(ge.b bVar) {
        Pair pair;
        e0.i(bVar);
        synchronized (this.zzf) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= this.zzf.size()) {
                        pair = null;
                        break;
                    } else {
                        if (bVar.equals(((Pair) this.zzf.get(i10)).first)) {
                            pair = (Pair) this.zzf.get(i10);
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                Log.w(this.zzd, "OnEventListener had not been registered.");
                return;
            }
            this.zzf.remove(pair);
            zzdv zzdvVar = (zzdv) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdvVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzU(new zzdq(this, zzdvVar));
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdj(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zze(zzbzVar.zzb(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdc(this, zzbzVar));
        Long l10 = (Long) zzbz.zze(zzbzVar.zzb(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNanoTime = System.nanoTime();
        ((b) this.zza).getClass();
        long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = this.zzg + 1;
        this.zzg = i10;
        return jNextLong + i10;
    }

    public final Bundle zzc(Bundle bundle, boolean z2) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdh(this, bundle, zzbzVar));
        if (z2) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final fe.a zzd() {
        return this.zze;
    }

    public final zzcc zzf(Context context, boolean z2) {
        try {
            return zzcb.asInterface(e.c(context, e.f20282c, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (yd.a e10) {
            zzS(e10, true, false);
            return null;
        }
    }

    public final Object zzh(int i10) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdl(this, zzbzVar, i10));
        return zzbz.zze(zzbzVar.zzb(15000L), Object.class);
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdk(this, zzbzVar));
        return zzbzVar.zzc(120000L);
    }

    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdb(this, zzbzVar));
        return zzbzVar.zzc(50L);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzde(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdd(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        zzU(new zzda(this, zzbzVar));
        return zzbzVar.zzc(500L);
    }

    public final List zzp(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzcp(this, str, str2, zzbzVar));
        List list = (List) zzbz.zze(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map zzq(String str, String str2, boolean z2) {
        zzbz zzbzVar = new zzbz();
        zzU(new zzdf(this, str, str2, z2, zzbzVar));
        Bundle bundleZzb = zzbzVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleZzb.size());
        for (String str3 : bundleZzb.keySet()) {
            Object obj = bundleZzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzu(String str) {
        zzU(new zzcy(this, str));
    }

    public final void zzv(String str, String str2, Bundle bundle) {
        zzU(new zzco(this, str, str2, bundle));
    }

    public final void zzw(String str) {
        zzU(new zzcz(this, str));
    }

    public final void zzx(String str, Bundle bundle) {
        zzT(null, str, bundle, false, true, null);
    }

    public final void zzy(String str, String str2, Bundle bundle) {
        zzT(str, str2, bundle, true, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle, long j) {
        zzT(str, str2, bundle, true, false, Long.valueOf(j));
    }
}
