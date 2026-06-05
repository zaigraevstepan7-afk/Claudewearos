package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbch;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import mc.n;
import nc.t;
import qc.l0;
import qc.r0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbca {
    private final zzbcg zza;
    private final zzbch.zzt.zza zzb;
    private final boolean zzc;

    private zzbca() {
        this.zzb = zzbch.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbcg();
    }

    public static zzbca zza() {
        return new zzbca();
    }

    private final synchronized String zzd(int i10) {
        StringBuilder sb2;
        zzbch.zzt.zza zzaVar = this.zzb;
        String strZzah = zzaVar.zzah();
        n.D.f11584k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbr().zzaV(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strZzah);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i10 - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqk.zza(zzfqj.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i10).getBytes());
                } catch (IOException unused) {
                    l0.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        l0.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    l0.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            l0.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i10) {
        zzbch.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(r0.z());
        zzbce zzbceVar = new zzbce(this.zza, zzaVar.zzbr().zzaV(), null);
        int i11 = i10 - 1;
        zzbceVar.zza(i11);
        zzbceVar.zzc();
        l0.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void zzb(zzbbz zzbbzVar) {
        if (this.zzc) {
            try {
                zzbbzVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                n.D.f11582h.zzw(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfp)).booleanValue()) {
                zze(i10);
            } else {
                zzf(i10);
            }
        }
    }

    public zzbca(zzbcg zzbcgVar) {
        this.zzb = zzbch.zzt.zzj();
        this.zza = zzbcgVar;
        this.zzc = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfo)).booleanValue();
    }
}
