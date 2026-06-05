package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import mc.n;
import qc.b0;
import qc.l0;
import qc.r0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public final class zzbdh {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbdh zzbdhVar) throws Throwable {
        while (true) {
            try {
                zzbdr zzbdrVar = (zzbdr) zzbdhVar.zza.take();
                zzbdq zzbdqVarZza = zzbdrVar.zza();
                if (!TextUtils.isEmpty(zzbdqVarZza.zzb())) {
                    zzbdhVar.zzg(zzbdhVar.zzb(zzbdhVar.zzb, zzbdrVar.zzb()), zzbdqVarZza);
                }
            } catch (InterruptedException e10) {
                int i10 = l0.f13401b;
                k.h("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbdq zzbdqVar) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbdqVar != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbdqVar.zzb())) {
                sb2.append("&it=");
                sb2.append(zzbdqVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbdqVar.zza())) {
                sb2.append("&blat=");
                sb2.append(zzbdqVar.zza());
            }
            string = sb2.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!this.zzh.get()) {
            r0 r0Var = n.D.f11577c;
            new b0(this.zze, this.zzf, string, null).zzb();
            return;
        }
        File file = this.zzi;
        try {
            if (file == null) {
                int i10 = l0.f13401b;
                k.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e10) {
                e = e10;
            }
            try {
                fileOutputStream.write(string.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                } catch (IOException e11) {
                    int i11 = l0.f13401b;
                    k.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                }
            } catch (IOException e12) {
                e = e12;
                fileOutputStream2 = fileOutputStream;
                int i12 = l0.f13401b;
                k.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        k.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e14) {
                        int i13 = l0.f13401b;
                        k.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e14);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final zzbdn zza(String str) {
        zzbdn zzbdnVar = (zzbdn) this.zzc.get(str);
        return zzbdnVar != null ? zzbdnVar : zzbdn.zza;
    }

    public final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbex.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfqk.zza(zzfqj.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcad.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdg
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzbdh.zzc(this.zza);
            }
        });
        Map map2 = this.zzc;
        zzbdn zzbdnVar = zzbdn.zzb;
        map2.put("action", zzbdnVar);
        map2.put("ad_format", zzbdnVar);
        map2.put("e", zzbdn.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbdr zzbdrVar) {
        return this.zza.offer(zzbdrVar);
    }
}
