package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@Deprecated
/* loaded from: classes.dex */
public class zzags implements zzau {
    public final String zza;
    public final String zzb;

    public zzags(String str, String str2) {
        this.zza = zzfuk.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzags zzagsVar = (zzags) obj;
            if (this.zza.equals(zzagsVar.zza) && this.zzb.equals(zzagsVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        Integer numZzg;
        Integer numZzg2;
        Integer numZzg3;
        Integer numZzg4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numZzg = zzgbi.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzt(numZzg);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numZzg2 = zzgbi.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzs(numZzg2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numZzg3 = zzgbi.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzu(numZzg3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzarVar.zzd(this.zzb);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzarVar.zzj(this.zzb);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    zzarVar.zzr(this.zzb);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    zzarVar.zzh(this.zzb);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numZzg4 = zzgbi.zzg(this.zzb, 10)) != null) {
                    zzarVar.zzi(numZzg4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzarVar.zzc(this.zzb);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzarVar.zze(this.zzb);
                    break;
                }
                break;
        }
    }
}
