package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzsn implements zztd {
    private final zzfvw zza;
    private final zzfvw zzb;

    public zzsn(int i10) {
        zzsl zzslVar = new zzsl(i10);
        zzsm zzsmVar = new zzsm(i10);
        this.zza = zzslVar;
        this.zzb = zzsmVar;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        return new HandlerThread(zzsp.zzt(i10, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        return new HandlerThread(zzsp.zzt(i10, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    public final zzsp zzc(zztc zztcVar) throws Exception {
        Exception exc;
        MediaCodec mediaCodecCreateByCodecName;
        zzti zztiVar = zztcVar.zza;
        String str = zztiVar.zza;
        zzsp zzspVar = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                zzsp zzspVar2 = new zzsp(mediaCodecCreateByCodecName, zza(((zzsl) this.zza).zza), new zzst(mediaCodecCreateByCodecName, zzb(((zzsm) this.zzb).zza)), zztcVar.zzf, null);
                try {
                    Trace.endSection();
                    Surface surface = zztcVar.zzd;
                    int i10 = 0;
                    if (surface == null && zztiVar.zzh && Build.VERSION.SDK_INT >= 35) {
                        i10 = 8;
                    }
                    zzsp.zzh(zzspVar2, zztcVar.zzb, surface, null, i10);
                    return zzspVar2;
                } catch (Exception e10) {
                    exc = e10;
                    zzspVar = zzspVar2;
                    if (zzspVar != null) {
                        zzspVar.zzm();
                        throw exc;
                    }
                    if (mediaCodecCreateByCodecName == null) {
                        throw exc;
                    }
                    mediaCodecCreateByCodecName.release();
                    throw exc;
                }
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Exception e12) {
            exc = e12;
            mediaCodecCreateByCodecName = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztd
    public final /* bridge */ /* synthetic */ zztf zzd(zztc zztcVar) {
        throw null;
    }
}
