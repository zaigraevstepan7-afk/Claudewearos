package com.google.android.gms.internal.ads;

import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzid {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = this.zzd;
        int i14 = this.zze;
        int i15 = this.zzf;
        int i16 = this.zzg;
        int i17 = this.zzh;
        int i18 = this.zzi;
        int i19 = this.zzj;
        long j = this.zzk;
        int i20 = this.zzl;
        String str = zzex.zza;
        Locale locale = Locale.US;
        StringBuilder sbQ = gk.b.q("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        sbQ.append(i12);
        sbQ.append("\n skippedInputBuffers=");
        sbQ.append(i13);
        sbQ.append("\n renderedOutputBuffers=");
        sbQ.append(i14);
        sbQ.append("\n skippedOutputBuffers=");
        sbQ.append(i15);
        sbQ.append("\n droppedBuffers=");
        sbQ.append(i16);
        sbQ.append("\n droppedInputBuffers=");
        sbQ.append(i17);
        sbQ.append("\n maxConsecutiveDroppedBuffers=");
        sbQ.append(i18);
        sbQ.append("\n droppedToKeyframeEvents=");
        sbQ.append(i19);
        sbQ.append("\n totalVideoFrameProcessingOffsetUs=");
        sbQ.append(j);
        sbQ.append("\n videoFrameProcessingOffsetCount=");
        sbQ.append(i20);
        sbQ.append("\n}");
        return sbQ.toString();
    }

    public final synchronized void zza() {
    }
}
