package i7;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f8361e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8362a;

    /* renamed from: b, reason: collision with root package name */
    public final File f8363b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f8364c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f8365d;

    public a(String str, File file, boolean z2) {
        Lock lock;
        this.f8362a = z2;
        this.f8363b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f8361e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f8364c = lock;
    }

    public final void a(boolean z2) throws IOException {
        this.f8364c.lock();
        if (z2) {
            File file = this.f8363b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f8365d = channel;
            } catch (IOException e10) {
                this.f8365d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() throws IOException {
        try {
            FileChannel fileChannel = this.f8365d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f8364c.unlock();
    }
}
