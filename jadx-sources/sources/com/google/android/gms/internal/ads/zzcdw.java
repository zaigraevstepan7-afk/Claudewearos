package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcdw extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzhd zzg;
    private zzgo zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcdw(String str, zzhj zzhjVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcdv(this);
        this.zzr = new HashSet();
        zzdd.zzc(str);
        this.zzf = str;
        this.zzg = new zzhd();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = l0.f13401b;
                k.e("Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j4 = this.zzm;
                    if (j == j4) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i12 = this.zzj.read(bArr2, 0, (int) Math.min(j4 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += i12;
                    zzg(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j10 = this.zzn;
            if (j10 != -1) {
                long j11 = j10 - this.zzp;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            int i13 = this.zzj.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += i13;
            zzg(i13);
            return i13;
        } catch (IOException e10) {
            throw new zzha(e10, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x021d, B:97:0x0228, B:99:0x0239, B:102:0x0242, B:103:0x0251, B:105:0x0258, B:106:0x025f, B:107:0x0260, B:108:0x0276), top: B:115:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0228 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x021d, B:97:0x0228, B:99:0x0239, B:102:0x0242, B:103:0x0251, B:105:0x0258, B:106:0x025f, B:107:0x0260, B:108:0x0276), top: B:115:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdw.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                String str = zzex.zza;
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzha(e10, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e10) {
                    int i11 = l0.f13401b;
                    k.h("Failed to update receive buffer size.", e10);
                }
            }
        }
    }
}
