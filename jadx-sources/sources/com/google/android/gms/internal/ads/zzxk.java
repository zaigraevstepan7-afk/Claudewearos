package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzxk {
    public static final zzxk zza = new zzxk(new zzbm[0]);
    public final int zzb;
    private final zzfyf zzc;
    private int zzd;

    static {
        String str = zzex.zza;
        Integer.toString(0, 36);
    }

    public zzxk(zzbm... zzbmVarArr) {
        this.zzc = zzfyf.zzm(zzbmVarArr);
        this.zzb = zzbmVarArr.length;
        int i10 = 0;
        while (i10 < this.zzc.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zzc.size(); i12++) {
                if (((zzbm) this.zzc.get(i10)).equals(this.zzc.get(i12))) {
                    zzea.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxk.class == obj.getClass()) {
            zzxk zzxkVar = (zzxk) obj;
            if (this.zzb == zzxkVar.zzb && this.zzc.equals(zzxkVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.zzc.hashCode();
        this.zzd = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final int zza(zzbm zzbmVar) {
        int iIndexOf = this.zzc.indexOf(zzbmVar);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final zzbm zzb(int i10) {
        return (zzbm) this.zzc.get(i10);
    }

    public final zzfyf zzc() {
        return zzfyf.zzl(zzfyv.zzc(this.zzc, new zzfut() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzxk zzxkVar = zzxk.zza;
                return Integer.valueOf(((zzbm) obj).zzc);
            }
        }));
    }
}
