package lg;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f10937e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f10938a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f10939b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10940c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f10941d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f10939b = str;
        this.f10940c = i10;
        this.f10941d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f10937e.newThread(new ac.e(14, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f10939b + " Thread #" + this.f10938a.getAndIncrement());
        return threadNewThread;
    }
}
