package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.internal.p001authapiphone.zzab;
import ig.r;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qd.a;
import t.m1;
import wd.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzadx {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaea> zzd = new HashMap<>();

    public zzadx(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null || zzaeaVar.zzh || zzah.zzc(zzaeaVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaeaVar.zzd);
        }
        zzaeaVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        if (!zzaeaVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }

    public final String zzb() throws NoSuchAlgorithmException {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, (Build.VERSION.SDK_INT < 28 ? b.a(this.zzb).d(64, packageName).signatures : b.a(this.zzb).d(134217728, packageName).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzc(String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaeaVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaeaVar.zzf.cancel(false);
        }
        zzaeaVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final zzacf zza(zzacf zzacfVar, String str) {
        return new zzady(this, zzacfVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) throws NoSuchAlgorithmException {
        String strW = m1.w(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(strW.getBytes(zzq.zza));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e10) {
            zza.c(m1.i("NoSuchAlgorithm: ", e10.getMessage()), new Object[0]);
            return null;
        }
    }

    public final void zzb(zzacf zzacfVar, String str) {
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar == null) {
            return;
        }
        zzaeaVar.zzb.add(zzacfVar);
        if (zzaeaVar.zzg) {
            zzacfVar.zzb(zzaeaVar.zzd);
        }
        if (zzaeaVar.zzh) {
            zzacfVar.zza(new r(zzaeaVar.zzd, zzaeaVar.zze, null, null, true));
        }
        if (zzaeaVar.zzi) {
            zzacfVar.zza(zzaeaVar.zzd);
        }
    }

    public static void zza(zzadx zzadxVar, String str) {
        zzaea zzaeaVar = zzadxVar.zzd.get(str);
        if (zzaeaVar == null || zzah.zzc(zzaeaVar.zzd) || zzah.zzc(zzaeaVar.zze) || zzaeaVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzacf> it = zzaeaVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(new r(zzaeaVar.zzd, zzaeaVar.zze, null, null, true));
        }
        zzaeaVar.zzh = true;
    }

    public final void zza(final String str, zzacf zzacfVar, long j, boolean z2) {
        this.zzd.put(str, new zzaea(j, z2));
        zzb(zzacfVar, str);
        zzaea zzaeaVar = this.zzd.get(str);
        if (zzaeaVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeaVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(str);
            }
        }, zzaeaVar.zza, TimeUnit.SECONDS);
        if (!zzaeaVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaeb zzaebVar = new zzaeb(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzaebVar, intentFilter);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzadz(this));
    }
}
