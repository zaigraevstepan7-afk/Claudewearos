package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import nc.k3;
import nc.q3;
import nc.s;
import nc.t;
import nd.f;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbym {
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zze = new AtomicInteger(-1);
    private final AtomicReference zzf = new AtomicReference(null);
    private final AtomicReference zzg = new AtomicReference(null);
    private final ConcurrentMap zzh = new ConcurrentHashMap(9);
    private final Object zzi = new Object();

    public static /* synthetic */ String zza(zzbym zzbymVar, Context context) {
        return (String) zzbymVar.zzs("getAppInstanceId", context);
    }

    public static final Bundle zzq(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean zzr(Context context) throws ClassNotFoundException {
        zzbct zzbctVar = zzbdc.zzaz;
        t tVar = t.f12227d;
        if (!((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            return false;
        }
        if (yd.e.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) tVar.f12230c.zzb(zzbdc.zzaA)).intValue()) {
            return false;
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzaB)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Object zzs(String str, Context context) throws NoSuchMethodException, SecurityException {
        AtomicReference atomicReference = this.zzf;
        if (!zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzt(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            zzw(str, true);
            return null;
        }
    }

    private final Method zzt(Context context, String str) throws NoSuchMethodException, SecurityException {
        ConcurrentMap concurrentMap = this.zzh;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzw(str, false);
            return null;
        }
    }

    private final void zzu(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method declaredMethod = (Method) concurrentMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    zzw(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzf.get(), str);
                l0.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                zzw(str2, false);
            }
        }
    }

    private final void zzv(Context context, String str, String str2, Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String strValueOf = String.valueOf(str2);
                int i10 = l0.f13401b;
                k.e("Invalid event ID: ".concat(strValueOf), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", this.zzf, true)) {
                ConcurrentMap concurrentMap = this.zzh;
                Method declaredMethod = (Method) concurrentMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        zzw("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.zzf.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzw("logEventInternal", true);
                }
            }
        }
    }

    private final void zzw(String str, boolean z2) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        String strJ = m1.j("Invoke Firebase method ", str, " error.");
        int i10 = l0.f13401b;
        k.g(strJ);
        if (z2) {
            k.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean zzx(Context context, String str, AtomicReference atomicReference, boolean z2) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            zzbyj.zza(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            return true;
        } catch (Exception unused) {
            zzw("getInstance", z2);
            return false;
        }
    }

    public final String zzb(Context context) {
        Object objZzs;
        if (zzp(context) && (objZzs = zzs("generateEventId", context)) != null) {
            return objZzs.toString();
        }
        return null;
    }

    public final String zzc(final Context context) {
        if (!zzp(context)) {
            return null;
        }
        zzbct zzbctVar = zzbdc.zzax;
        t tVar = t.f12227d;
        long jLongValue = ((Long) tVar.f12230c.zzb(zzbctVar)).longValue();
        if (jLongValue < 0) {
            return (String) zzs("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            zzbct zzbctVar2 = zzbdc.zzay;
            zzbyj.zza(atomicReference, null, new ThreadPoolExecutor(((Integer) tVar.f12230c.zzb(zzbctVar2)).intValue(), ((Integer) tVar.f12230c.zzb(zzbctVar2)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyl(this)));
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzbym.zza(this.zza, context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzd(Context context) {
        if (zzp(context)) {
            AtomicReference atomicReference = this.zzf;
            if (zzx(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzt(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) zzt(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzw("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    public final String zze(Context context) {
        if (!zzp(context)) {
            return null;
        }
        synchronized (this.zzc) {
            try {
                String str = this.zzd;
                if (str != null) {
                    return str;
                }
                String str2 = (String) zzs("getGmpAppId", context);
                this.zzd = str2;
                return str2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzf(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            zzu(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzg(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            zzu(context, str, "endAdUnitExposure");
        }
    }

    public final void zzh(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzv(context, "_aa", str, null);
    }

    public final void zzi(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzv(context, "_aq", str, null);
    }

    public final void zzj(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzv(context, "_ac", str, zzq(map));
    }

    public final void zzk(Context context, String str, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzv(context, "_ai", str, zzq(map));
    }

    public final void zzl(Context context, String str, String str2, String str3, int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            zzv(context, "_ar", str, bundle);
            l0.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
        }
    }

    public final void zzm(Context context, q3 q3Var) {
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaE)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    public final void zzn(Context context, k3 k3Var) {
        zzbyn.zzb(context).zza().zzc(k3Var);
        if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzaE)).booleanValue() && zzp(context) && zzr(context)) {
            synchronized (this.zzi) {
            }
        }
    }

    @Deprecated
    public final void zzo(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (zzp(context) && (context instanceof Activity) && zzx(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzg, false)) {
            ConcurrentMap concurrentMap = this.zzh;
            Method declaredMethod = (Method) concurrentMap.get("setCurrentScreen");
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", declaredMethod);
                } catch (Exception unused) {
                    zzw("setCurrentScreen", false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.zzg.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzw("setCurrentScreen", false);
            }
        }
    }

    public final boolean zzp(Context context) {
        int iD;
        zzbct zzbctVar = zzbdc.zzar;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && !this.zza.get()) {
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzaC)).booleanValue()) {
                AtomicInteger atomicInteger = this.zze;
                if (atomicInteger.get() == -1) {
                    rc.e eVar = s.f12202f.f12203a;
                    f fVar = f.f12280b;
                    if (fVar.d(context, 12451000) != 0 && ((iD = fVar.d(context, 12451000)) == 0 || iD == 2)) {
                        int i10 = l0.f13401b;
                        k.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    } else {
                        atomicInteger.set(1);
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }
}
