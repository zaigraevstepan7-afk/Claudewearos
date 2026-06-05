package qg;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13489a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13490b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f13491c;

    /* renamed from: e, reason: collision with root package name */
    public int f13493e = this.f13491c;

    /* renamed from: d, reason: collision with root package name */
    public int f13492d;

    /* renamed from: f, reason: collision with root package name */
    public int f13494f = this.f13492d;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13495z = false;

    public b() {
        this.f13489a = null;
        this.f13489a = new ArrayList();
    }

    public final long b(long j) {
        long j4 = 0;
        while (this.f13492d < this.f13489a.size() && j4 < j) {
            String strG = g();
            long j10 = j - j4;
            long length = strG == null ? 0 : strG.length() - this.f13491c;
            if (j10 < length) {
                this.f13491c = (int) (this.f13491c + j10);
                j4 += j10;
            } else {
                j4 += length;
                this.f13491c = 0;
                this.f13492d++;
            }
        }
        return j4;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        e();
        this.f13490b = true;
    }

    public final void e() throws IOException {
        if (this.f13490b) {
            throw new IOException("Stream already closed");
        }
        if (!this.f13495z) {
            throw new IOException("Reader needs to be frozen before read operations can be called");
        }
    }

    public final String g() {
        int i10 = this.f13492d;
        ArrayList arrayList = this.f13489a;
        if (i10 < arrayList.size()) {
            return (String) arrayList.get(this.f13492d);
        }
        return null;
    }

    @Override // java.io.Reader
    public final void mark(int i10) throws IOException {
        e();
        this.f13493e = this.f13491c;
        this.f13494f = this.f13492d;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final int read(CharBuffer charBuffer) throws IOException {
        e();
        int iRemaining = charBuffer.remaining();
        String strG = g();
        int i10 = 0;
        while (iRemaining > 0 && strG != null) {
            int iMin = Math.min(strG.length() - this.f13491c, iRemaining);
            String str = (String) this.f13489a.get(this.f13492d);
            int i11 = this.f13491c;
            charBuffer.put(str, i11, i11 + iMin);
            iRemaining -= iMin;
            i10 += iMin;
            b(iMin);
            strG = g();
        }
        if (i10 > 0 || strG != null) {
            return i10;
        }
        return -1;
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        e();
        return true;
    }

    @Override // java.io.Reader
    public final void reset() {
        this.f13491c = this.f13493e;
        this.f13492d = this.f13494f;
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        e();
        return b(j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f13489a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            sb2.append((String) obj);
        }
        return sb2.toString();
    }

    @Override // java.io.Reader
    public final int read() throws IOException {
        e();
        String strG = g();
        if (strG == null) {
            return -1;
        }
        char cCharAt = strG.charAt(this.f13491c);
        b(1L);
        return cCharAt;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i10, int i11) throws IOException {
        e();
        String strG = g();
        int i12 = 0;
        while (strG != null && i12 < i11) {
            String strG2 = g();
            int iMin = Math.min(strG2 == null ? 0 : strG2.length() - this.f13491c, i11 - i12);
            int i13 = this.f13491c;
            strG.getChars(i13, i13 + iMin, cArr, i10 + i12);
            i12 += iMin;
            b(iMin);
            strG = g();
        }
        if (i12 > 0 || strG != null) {
            return i12;
        }
        return -1;
    }
}
