package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public interface zztf {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i10);

    ByteBuffer zzg(int i10);

    void zzi();

    void zzj();

    void zzk(int i10, int i11, int i12, long j, int i13);

    void zzl(int i10, int i11, zzhp zzhpVar, long j, int i12);

    void zzm();

    void zzn(int i10, long j);

    void zzo(int i10, boolean z2);

    void zzp(Surface surface);

    void zzq(Bundle bundle);

    void zzr(int i10);

    boolean zzs(zzte zzteVar);
}
