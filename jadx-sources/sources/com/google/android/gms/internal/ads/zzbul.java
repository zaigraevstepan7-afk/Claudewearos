package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.s;
import nc.t;
import nd.f;
import rc.k;
import rc.o;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbul implements zzbun {
    public static zzbun zza;
    static zzbun zzb;
    static zzbun zzc;
    static Boolean zzd;
    private static final Object zze = new Object();
    private final Object zzf;
    private final Context zzg;
    private final WeakHashMap zzh;
    private final ExecutorService zzi;
    private final rc.a zzj;
    private final PackageInfo zzk;
    private final String zzl;
    private final String zzm;
    private final AtomicBoolean zzn;
    private boolean zzo;
    private Set zzp;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbul(android.content.Context r4, rc.a r5) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.zzf = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r3.zzh = r0
            com.google.android.gms.internal.ads.zzfrm.zza()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r3.zzi = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r3.zzn = r0
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto L2f
            android.content.Context r4 = r4.getApplicationContext()
        L2f:
            r3.zzg = r4
            r3.zzj = r5
            com.google.android.gms.internal.ads.zzbct r5 = com.google.android.gms.internal.ads.zzbdc.zzhY
            nc.t r0 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r0 = r0.f12230c
            java.lang.Object r5 = r0.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0 = 0
            if (r5 == 0) goto L50
            com.google.android.gms.internal.ads.zzfrn r5 = rc.e.f14331b
            if (r4 == 0) goto L50
            android.content.pm.ApplicationInfo r5 = r4.getApplicationInfo()
            if (r5 != 0) goto L52
        L50:
            r4 = r0
            goto L61
        L52:
            k3.a r5 = wd.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
            r1 = 0
            android.content.pm.PackageInfo r4 = r5.d(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L50
        L61:
            r3.zzk = r4
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzhW
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r1 = r5.f12230c
            java.lang.Object r1 = r1.zzb(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L82
            com.google.android.gms.internal.ads.zzfrn r1 = rc.e.f14331b
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getCountry()
            goto L83
        L82:
            r1 = r2
        L83:
            r3.zzl = r1
            com.google.android.gms.internal.ads.zzbda r5 = r5.f12230c
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lb0
            android.content.Context r4 = r3.zzg
            com.google.android.gms.internal.ads.zzfrn r5 = rc.e.f14331b
            if (r4 != 0) goto L9a
            goto Lb1
        L9a:
            k3.a r4 = wd.b.a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r5 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.d(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r4 != 0) goto La9
            goto Lb1
        La9:
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r2
        Lb1:
            r3.zzm = r0
            com.google.android.gms.internal.ads.zzbct r4 = com.google.android.gms.internal.ads.zzbdc.zzhS
            nc.t r5 = nc.t.f12227d
            com.google.android.gms.internal.ads.zzbda r5 = r5.f12230c
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto Lcc
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.zzp = r4
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbul.<init>(android.content.Context, rc.a):void");
    }

    public static zzbun zza(Context context) {
        synchronized (zze) {
            try {
                if (zza == null) {
                    if (zzl(context)) {
                        zza = new zzbul(context, rc.a.b());
                    } else {
                        zza = new zzbum();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zza;
    }

    public static zzbun zzb(Context context, rc.a aVar) {
        synchronized (zze) {
            try {
                if (zzc == null) {
                    boolean z2 = false;
                    if (((Boolean) zzbeu.zzc.zze()).booleanValue()) {
                        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhQ)).booleanValue() || ((Boolean) zzbeu.zza.zze()).booleanValue()) {
                            z2 = true;
                        }
                    }
                    if (zzl(context)) {
                        zzbul zzbulVar = new zzbul(context, aVar);
                        zzbulVar.zzk();
                        zzbulVar.zzj();
                        zzc = zzbulVar;
                    } else if (!z2 || context == null) {
                        zzc = new zzbum();
                    } else {
                        zzbul zzbulVar2 = new zzbul(context, aVar, true);
                        zzbulVar2.zzk();
                        zzbulVar2.zzj();
                        zzc = zzbulVar2;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0037, B:14:0x003e), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbun zzc(android.content.Context r4) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbul.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbun r1 = com.google.android.gms.internal.ads.zzbul.zzb     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L3e
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzhR     // Catch: java.lang.Throwable -> L35
            nc.t r2 = nc.t.f12227d     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbda r3 = r2.f12230c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r3.zzb(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzhQ     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L35
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L35
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L37
            com.google.android.gms.internal.ads.zzbul r1 = new com.google.android.gms.internal.ads.zzbul     // Catch: java.lang.Throwable -> L35
            rc.a r2 = rc.a.b()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbul.zzb = r1     // Catch: java.lang.Throwable -> L35
            goto L3e
        L35:
            r4 = move-exception
            goto L42
        L37:
            com.google.android.gms.internal.ads.zzbum r4 = new com.google.android.gms.internal.ads.zzbum     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbul.zzb = r4     // Catch: java.lang.Throwable -> L35
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            com.google.android.gms.internal.ads.zzbun r4 = com.google.android.gms.internal.ads.zzbul.zzb
            return r4
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbul.zzc(android.content.Context):com.google.android.gms.internal.ads.zzbun");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x0029, B:13:0x0033, B:14:0x003a), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbun zzd(android.content.Context r4, rc.a r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzbul.zze
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbun r1 = com.google.android.gms.internal.ads.zzbul.zzb     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L3a
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzhR     // Catch: java.lang.Throwable -> L31
            nc.t r2 = nc.t.f12227d     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbda r3 = r2.f12230c     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r3.zzb(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L33
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.internal.ads.zzbdc.zzhQ     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbda r2 = r2.f12230c     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L33
            com.google.android.gms.internal.ads.zzbul r1 = new com.google.android.gms.internal.ads.zzbul     // Catch: java.lang.Throwable -> L31
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbul.zzb = r1     // Catch: java.lang.Throwable -> L31
            goto L3a
        L31:
            r4 = move-exception
            goto L3e
        L33:
            com.google.android.gms.internal.ads.zzbum r4 = new com.google.android.gms.internal.ads.zzbum     // Catch: java.lang.Throwable -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbul.zzb = r4     // Catch: java.lang.Throwable -> L31
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzbun r4 = com.google.android.gms.internal.ads.zzbul.zzb
            return r4
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbul.zzd(android.content.Context, rc.a):com.google.android.gms.internal.ads.zzbun");
    }

    public static String zze(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzf(Throwable th2) {
        return zzfvv.zzc(rc.e.d(zze(th2), "SHA-256"));
    }

    private final void zzj() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbuj(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    private final void zzk() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.zzf) {
            this.zzh.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbuk(this, thread.getUncaughtExceptionHandler()));
    }

    private static boolean zzl(Context context) {
        if (context == null) {
            return false;
        }
        synchronized (zze) {
            try {
                if (zzd == null) {
                    zzd = Boolean.valueOf(s.f12202f.f12207e.nextInt(100) < ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzmU)).intValue());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzd.booleanValue()) {
            if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzhQ)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void zzg(Thread thread, Throwable th2) {
        if (th2 != null) {
            boolean zL = false;
            boolean zEquals = false;
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zL |= rc.e.l(stackTraceElement.getClassName());
                    zEquals |= zzbul.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzhS)).intValue();
            if (iIntValue > 0) {
                if (this.zzp.size() >= iIntValue) {
                    return;
                }
                String strZzf = zzf(th2);
                if (this.zzp.contains(strZzf)) {
                    return;
                } else {
                    this.zzp.add(strZzf);
                }
            }
            if (!zL || zEquals) {
                return;
            }
            if (!this.zzo) {
                zzh(th2, "");
            }
            if (this.zzn.getAndSet(true) || !((Boolean) zzbeu.zzc.zze()).booleanValue()) {
                return;
            }
            zzbcm.zzc(this.zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzh(Throwable th2, String str) {
        if (this.zzo) {
            return;
        }
        zzi(th2, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzi(Throwable th2, String str, float f10) {
        Throwable th3;
        boolean zF;
        String packageName;
        ActivityManager activityManager;
        ActivityManager.MemoryInfo memoryInfo;
        if (this.zzo) {
            return;
        }
        zzfrn zzfrnVar = rc.e.f14331b;
        int i10 = 0;
        if (((Boolean) zzbfl.zze.zze()).booleanValue()) {
            th3 = th2;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th3 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                boolean z2 = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzcz)).booleanValue() && stackTrace != null && stackTrace.length == 0 && rc.e.l(th4.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (rc.e.l(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th3 = th3 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th3);
                    th3.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th3 != null) {
            String name = th2.getClass().getName();
            String strZze = zze(th2);
            String strZzf = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzjb)).booleanValue() ? zzf(th2) : "";
            double d10 = f10;
            double dRandom = Math.random();
            int i11 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zF = wd.b.a(this.zzg).f();
                } catch (Throwable th5) {
                    k.e("Error fetching instant app info", th5);
                    zF = false;
                }
                try {
                    packageName = this.zzg.getPackageName();
                } catch (Throwable unused) {
                    k.g("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zF)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
                String str2 = Build.MANUFACTURER;
                String strW = Build.MODEL;
                if (!strW.startsWith(str2)) {
                    strW = m1.w(str2, " ", strW);
                }
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", strW);
                rc.a aVar = this.zzj;
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("js", aVar.f14321a).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strZze);
                t tVar = t.f12227d;
                zzbcu zzbcuVar = tVar.f12228a;
                zzbda zzbdaVar = tVar.f12230c;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("eids", TextUtils.join(",", zzbcuVar.zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "761682454").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i11)).appendQueryParameter("pb_tm", String.valueOf(zzbfl.zzc.zze()));
                Context context = this.zzg;
                f.f12280b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(f.a(context))).appendQueryParameter("lite", true != aVar.f14325e ? "0" : "1");
                if (!TextUtils.isEmpty(strZzf)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", strZzf);
                }
                if (((Boolean) zzbdaVar.zzb(zzbdc.zzhX)).booleanValue()) {
                    if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
                        memoryInfo = null;
                    } else {
                        memoryInfo = new ActivityManager.MemoryInfo();
                        try {
                            activityManager.getMemoryInfo(memoryInfo);
                        } catch (NullPointerException unused2) {
                            k.g("Error retrieving the memory information.");
                        }
                    }
                    if (memoryInfo != null) {
                        builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfo.availMem));
                        builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfo.totalMem));
                        builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfo.lowMemory ? "0" : "1");
                    }
                }
                if (((Boolean) zzbdaVar.zzb(zzbdc.zzhW)).booleanValue()) {
                    String str3 = this.zzl;
                    if (!TextUtils.isEmpty(str3)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str3);
                    }
                    String str4 = this.zzm;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str4);
                    }
                    PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                    if (currentWebViewPackage != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(currentWebViewPackage.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", currentWebViewPackage.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", currentWebViewPackage.packageName);
                    }
                }
                PackageInfo packageInfo = this.zzk;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    final String str5 = (String) obj;
                    final o oVar = new o(null);
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbui
                        @Override // java.lang.Runnable
                        public final void run() {
                            oVar.zza(str5);
                        }
                    });
                }
            }
        }
    }

    public zzbul(Context context, rc.a aVar, boolean z2) {
        this(context, aVar);
        this.zzo = true;
    }
}
