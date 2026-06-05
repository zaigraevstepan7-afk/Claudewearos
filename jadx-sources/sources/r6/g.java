package r6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f13806a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13807b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13808c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13809d;

    public g(long j, int i10, int i11, long j4) {
        this.f13806a = i10;
        this.f13807b = i11;
        this.f13808c = j;
        this.f13809d = j4;
    }

    public static g a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            g gVar = new g(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f13806a);
            dataOutputStream.writeInt(this.f13807b);
            dataOutputStream.writeLong(this.f13808c);
            dataOutputStream.writeLong(this.f13809d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (this.f13807b == gVar.f13807b && this.f13808c == gVar.f13808c && this.f13806a == gVar.f13806a && this.f13809d == gVar.f13809d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13807b), Long.valueOf(this.f13808c), Integer.valueOf(this.f13806a), Long.valueOf(this.f13809d));
    }
}
