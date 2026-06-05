package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zziq implements zzii {
    final int zza;
    final zzmb zzb;

    public zziq(zziw zziwVar, int i10, zzmb zzmbVar, boolean z2, boolean z10) {
        this.zza = i10;
        this.zzb = zzmbVar;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zza - ((zziq) obj).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final zzkd zzb(zzkd zzkdVar, zzke zzkeVar) {
        ((zzin) zzkdVar).zzg((zzit) zzkeVar);
        return zzkdVar;
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final zzkj zzc(zzkj zzkjVar, zzkj zzkjVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final zzmb zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final zzmc zze() {
        return this.zzb.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzii
    public final boolean zzg() {
        return false;
    }
}
