package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class zzbq {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzfyf zzi;
    private zzfyf zzj;
    private zzfyf zzk;
    private int zzl;
    private int zzm;
    private zzfyf zzn;
    private zzbp zzo;
    private zzfyf zzp;
    private boolean zzq;
    private HashMap zzr;
    private HashSet zzs;

    public zzbq() {
        this.zza = f.API_PRIORITY_OTHER;
        this.zzb = f.API_PRIORITY_OTHER;
        this.zzc = f.API_PRIORITY_OTHER;
        this.zzd = f.API_PRIORITY_OTHER;
        this.zze = f.API_PRIORITY_OTHER;
        this.zzf = f.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzfyf.zzn();
        this.zzj = zzfyf.zzn();
        this.zzk = zzfyf.zzn();
        this.zzl = f.API_PRIORITY_OTHER;
        this.zzm = f.API_PRIORITY_OTHER;
        this.zzn = zzfyf.zzn();
        this.zzo = zzbp.zza;
        this.zzp = zzfyf.zzn();
        this.zzq = true;
        this.zzr = new HashMap();
        this.zzs = new HashSet();
    }

    private final void zzu(zzbr zzbrVar) {
        this.zza = zzbrVar.zza;
        this.zzb = zzbrVar.zzb;
        this.zzc = zzbrVar.zzc;
        this.zzd = zzbrVar.zzd;
        this.zze = zzbrVar.zzi;
        this.zzf = zzbrVar.zzj;
        this.zzg = zzbrVar.zzk;
        this.zzh = zzbrVar.zzl;
        this.zzi = zzbrVar.zzm;
        this.zzj = zzbrVar.zzn;
        this.zzk = zzbrVar.zzp;
        this.zzl = zzbrVar.zzr;
        this.zzm = zzbrVar.zzs;
        this.zzn = zzbrVar.zzt;
        this.zzo = zzbrVar.zzu;
        this.zzp = zzbrVar.zzv;
        this.zzq = zzbrVar.zzx;
        this.zzs = new HashSet(zzbrVar.zzE);
        this.zzr = new HashMap(zzbrVar.zzD);
    }

    public final zzbq zzj(zzbr zzbrVar) {
        zzu(zzbrVar);
        return this;
    }

    public zzbq(zzbr zzbrVar) {
        zzu(zzbrVar);
    }
}
