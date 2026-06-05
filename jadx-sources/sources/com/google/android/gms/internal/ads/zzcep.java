package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qc.l0;
import rc.k;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcep extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzhd zze;
    private zzgo zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcep(String str, zzhj zzhjVar, int i10, int i11, long j, long j4) {
        super(true);
        zzdd.zzc(str);
        this.zzd = str;
        this.zze = new zzhd();
        this.zzb = i10;
        this.zzc = i11;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j4;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e10) {
                int i10 = l0.f13401b;
                k.e("Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j4 = this.zzm;
            if (j - j4 == 0) {
                return -1;
            }
            long j10 = this.zzn + j4;
            long j11 = i11;
            long j12 = j10 + j11 + this.zzr;
            long j13 = this.zzp;
            long j14 = j13 + 1;
            if (j12 > j14) {
                long j15 = this.zzo;
                if (j13 < j15) {
                    long jMin = Math.min(j15, Math.max(((this.zzq + j14) - r4) - 1, (j14 + j11) - 1));
                    zzk(j14, jMin, 2);
                    this.zzp = jMin;
                    j13 = jMin;
                }
            }
            int i12 = this.zzi.read(bArr, i10, (int) Math.min(j11, ((j13 + 1) - this.zzn) - this.zzm));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.zzm += i12;
            zzg(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzha(e10, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException, NumberFormatException {
        this.zzf = zzgoVar;
        this.zzm = 0L;
        long j = zzgoVar.zze;
        long j4 = zzgoVar.zzf;
        long jMin = j4 == -1 ? this.zzq : Math.min(this.zzq, j4);
        this.zzn = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j10 = Long.parseLong(matcher.group(2));
                    long j11 = Long.parseLong(matcher.group(3));
                    long j12 = zzgoVar.zzf;
                    if (j12 != -1) {
                        this.zzl = j12;
                        this.zzo = Math.max(j10, (this.zzn + j12) - 1);
                    } else {
                        this.zzl = j11 - this.zzn;
                        this.zzo = j11 - 1;
                    }
                    this.zzp = j10;
                    this.zzj = true;
                    zzj(zzgoVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strJ = m1.j("Unexpected Content-Range [", headerField, "]");
                    int i10 = l0.f13401b;
                    k.d(strJ);
                }
            }
        }
        throw new zzcen(headerField, zzgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzha(e10, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j, long j4, int i10) throws IOException {
        int i11;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e10) {
                    iOException = e10;
                    i11 = i10;
                    throw new zzha("Unable to connect to ".concat(String.valueOf(string)), iOException, this.zzf, 2000, i11);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j4);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceo(this.zzk, headerFields, this.zzf, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e11) {
                    zzl();
                    throw new zzha(e11, this.zzf, 2000, i10);
                }
            } catch (IOException e12) {
                zzl();
                throw new zzha("Unable to connect to ".concat(String.valueOf(string2)), e12, this.zzf, 2000, i10);
            }
        } catch (IOException e13) {
            i11 = i10;
            iOException = e13;
        }
    }
}
