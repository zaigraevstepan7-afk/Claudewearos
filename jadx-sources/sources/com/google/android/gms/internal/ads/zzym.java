package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzym {
    private final Spatializer zza;
    private final boolean zzb;
    private final Handler zzc;
    private final Spatializer$OnSpatializerStateChangedListener zzd;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.zzyk] */
    public zzym(Context context, zzyu zzyuVar) {
        AudioManager audioManagerZzc = context == null ? null : zzcj.zzc(context);
        if (audioManagerZzc == null || zzex.zzN(context)) {
            this.zza = null;
            this.zzb = false;
            this.zzc = null;
            this.zzd = null;
            return;
        }
        Spatializer spatializer = audioManagerZzc.getSpatializer();
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
        zzyl zzylVar = new zzyl(this, zzyuVar);
        this.zzd = zzylVar;
        Looper looperMyLooper = Looper.myLooper();
        zzdd.zzb(looperMyLooper);
        final Handler handler = new Handler(looperMyLooper);
        this.zzc = handler;
        spatializer.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, zzylVar);
    }

    public final void zza() {
        Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        Handler handler;
        Spatializer spatializer = this.zza;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.zzd) == null || (handler = this.zzc) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        handler.removeCallbacksAndMessages(null);
    }

    public final boolean zzb(zze zzeVar, zzz zzzVar) throws IllegalArgumentException {
        int i10;
        String str = zzzVar.zzo;
        if (Objects.equals(str, "audio/eac3-joc")) {
            i10 = zzzVar.zzG;
            if (i10 == 16) {
                i10 = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            i10 = zzzVar.zzG;
            if (i10 == -1) {
                i10 = 6;
            }
        } else if (Objects.equals(str, "audio/ac4")) {
            i10 = zzzVar.zzG;
            if (i10 == 18 || i10 == 21) {
                i10 = 24;
            }
        } else {
            i10 = zzzVar.zzG;
        }
        int iZzi = zzex.zzi(i10);
        if (iZzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzi);
        int i11 = zzzVar.zzH;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return a.c(spatializer).canBeSpatialized(zzeVar.zza().zza, channelMask.build());
    }

    public final boolean zzc() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return a.c(spatializer).isAvailable();
    }

    public final boolean zzd() {
        Spatializer spatializer = this.zza;
        spatializer.getClass();
        return a.c(spatializer).isEnabled();
    }

    public final boolean zze() {
        return this.zzb;
    }
}
