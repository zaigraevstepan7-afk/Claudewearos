package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzpd implements zzmr, zzpe {
    private boolean zzA;
    private final Context zza;
    private final zzpf zzc;
    private final PlaybackSession zzd;
    private String zzj;
    private PlaybackMetrics.Builder zzk;
    private int zzl;
    private zzba zzo;
    private zzpc zzp;
    private zzpc zzq;
    private zzpc zzr;
    private zzz zzs;
    private zzz zzt;
    private zzz zzu;
    private boolean zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;
    private final Executor zzb = zzde.zza();
    private final zzbk zzf = new zzbk();
    private final zzbj zzg = new zzbj();
    private final HashMap zzi = new HashMap();
    private final HashMap zzh = new HashMap();
    private final long zze = SystemClock.elapsedRealtime();
    private int zzm = 0;
    private int zzn = 0;

    private zzpd(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzd = playbackSession;
        zzow zzowVar = new zzow(zzow.zza);
        this.zzc = zzowVar;
        zzowVar.zzh(this);
    }

    private final void zzA(zzbl zzblVar, zzvh zzvhVar) {
        int iZza;
        PlaybackMetrics.Builder builder = this.zzk;
        if (zzvhVar == null || (iZza = zzblVar.zza(zzvhVar.zza)) == -1) {
            return;
        }
        zzbj zzbjVar = this.zzg;
        int i10 = 0;
        zzblVar.zzd(iZza, zzbjVar, false);
        zzbk zzbkVar = this.zzf;
        zzblVar.zze(zzbjVar.zzc, zzbkVar, 0L);
        zzak zzakVar = zzbkVar.zzd.zzb;
        if (zzakVar != null) {
            int iZzo = zzex.zzo(zzakVar.zza);
            i10 = iZzo != 0 ? iZzo != 1 ? iZzo != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        long j = zzbkVar.zzm;
        if (j != -9223372036854775807L && !zzbkVar.zzk && !zzbkVar.zzi && !zzbkVar.zzb()) {
            builder.setMediaDurationMillis(zzex.zzv(j));
        }
        builder.setPlaybackType(true != zzbkVar.zzb() ? 1 : 2);
        this.zzA = true;
    }

    private final void zzB(long j, zzz zzzVar, int i10) {
        if (Objects.equals(this.zzs, zzzVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzzVar;
        zzC(1, j, zzzVar, i11);
    }

    private final void zzC(int i10, long j, zzz zzzVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = d.s(i10).setTimeSinceCreatedMillis(j - this.zze);
        if (zzzVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzzVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzzVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzzVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzzVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzzVar.zzv;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzzVar.zzw;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzzVar.zzG;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzzVar.zzH;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzzVar.zzd;
            if (str4 != null) {
                String str5 = zzex.zza;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzzVar.zzz;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzA = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzox
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private final boolean zzD(zzpc zzpcVar) {
        if (zzpcVar != null) {
            return zzpcVar.zzc.equals(this.zzc.zze());
        }
        return false;
    }

    public static zzpd zzb(Context context) {
        MediaMetricsManager mediaMetricsManagerB = c.b(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerB == null) {
            return null;
        }
        return new zzpd(context, mediaMetricsManagerB.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzw(int i10) {
        switch (zzex.zzl(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzx() {
        PlaybackMetrics.Builder builder = this.zzk;
        if (builder != null && this.zzA) {
            builder.setAudioUnderrunCount(this.zzz);
            this.zzk.setVideoFramesDropped(this.zzx);
            this.zzk.setVideoFramesPlayed(this.zzy);
            Long l10 = (Long) this.zzh.get(this.zzj);
            this.zzk.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzi.get(this.zzj);
            this.zzk.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzk.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.zzk.build();
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.zzk = null;
        this.zzj = null;
        this.zzz = 0;
        this.zzx = 0;
        this.zzy = 0;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzA = false;
    }

    private final void zzy(long j, zzz zzzVar, int i10) {
        if (Objects.equals(this.zzt, zzzVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzzVar;
        zzC(0, j, zzzVar, i11);
    }

    private final void zzz(long j, zzz zzzVar, int i10) {
        if (Objects.equals(this.zzu, zzzVar)) {
            return;
        }
        int i11 = this.zzu == null ? 1 : 0;
        this.zzu = zzzVar;
        zzC(2, j, zzzVar, i11);
    }

    public final LogSessionId zza() {
        return this.zzd.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzf(zzmp zzmpVar, int i10, long j, long j4) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar != null) {
            String strZzf = this.zzc.zzf(zzmpVar.zzb, zzvhVar);
            HashMap map = this.zzi;
            Long l10 = (Long) map.get(strZzf);
            HashMap map2 = this.zzh;
            Long l11 = (Long) map2.get(strZzf);
            map.put(strZzf, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j));
            map2.put(strZzf, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzg(zzmp zzmpVar, zzvd zzvdVar) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null) {
            return;
        }
        zzz zzzVar = zzvdVar.zzb;
        zzzVar.getClass();
        zzpc zzpcVar = new zzpc(zzzVar, 0, this.zzc.zzf(zzmpVar.zzb, zzvhVar));
        int i10 = zzvdVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzq = zzpcVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzr = zzpcVar;
                return;
            }
        }
        this.zzp = zzpcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029f  */
    @Override // com.google.android.gms.internal.ads.zzmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbh r20, com.google.android.gms.internal.ads.zzmq r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.zzi(com.google.android.gms.internal.ads.zzbh, com.google.android.gms.internal.ads.zzmq):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzl(zzmp zzmpVar, zzba zzbaVar) {
        this.zzo = zzbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzm(zzmp zzmpVar, zzbf zzbfVar, zzbf zzbfVar2, int i10) {
        if (i10 == 1) {
            this.zzv = true;
            i10 = 1;
        }
        this.zzl = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzo(zzmp zzmpVar, zzid zzidVar) {
        this.zzx += zzidVar.zzg;
        this.zzy += zzidVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzq(zzmp zzmpVar, zzcd zzcdVar) {
        zzpc zzpcVar = this.zzp;
        if (zzpcVar != null) {
            zzz zzzVar = zzpcVar.zza;
            if (zzzVar.zzw == -1) {
                zzx zzxVarZzb = zzzVar.zzb();
                zzxVarZzb.zzam(zzcdVar.zzb);
                zzxVarZzb.zzQ(zzcdVar.zzc);
                this.zzp = new zzpc(zzxVarZzb.zzan(), 0, zzpcVar.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzu(zzmp zzmpVar, String str) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            zzx();
            this.zzj = str;
            this.zzk = d.o().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0-alpha01");
            zzA(zzmpVar.zzb, zzvhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzv(zzmp zzmpVar, String str, boolean z2) {
        zzvh zzvhVar = zzmpVar.zzd;
        if ((zzvhVar == null || !zzvhVar.zzb()) && str.equals(this.zzj)) {
            zzx();
        }
        this.zzh.remove(str);
        this.zzi.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzk(zzmp zzmpVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zze(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzh(zzmp zzmpVar, int i10, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzn(zzmp zzmpVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final /* synthetic */ void zzp(zzmp zzmpVar, zzz zzzVar, zzie zzieVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzj(zzmp zzmpVar, zzuy zzuyVar, zzvd zzvdVar, IOException iOException, boolean z2) {
    }
}
