package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzayc extends zzayi {
    private final zzaxc zzh;
    private long zzi;

    public zzayc(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11, zzaxc zzaxcVar) {
        super(zzawvVar, "YdsvNQpLn71zCPsmNiBmaxgvKAoUotN+t67Ej8NmXEez61kI/ElwL7USsI8xuH+E", "BTo9KBR1VAIklcWQcnKn1k6hpYvG+18rom++PUlQVcU=", zzasrVar, i10, 53);
        this.zzh = zzaxcVar;
        if (zzaxcVar != null) {
            this.zzi = zzaxcVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() {
        if (this.zzh != null) {
            this.zzd.zzN(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
