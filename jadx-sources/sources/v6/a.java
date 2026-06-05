package v6;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import q5.b;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final y9.a f17866c = new y9.a();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f17867d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17868a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17869b;

    public a(String str, boolean z2) {
        ReentrantLock reentrantLock;
        synchronized (f17866c) {
            try {
                LinkedHashMap linkedHashMap = f17867d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17868a = reentrantLock;
        this.f17869b = z2 ? new b(str) : null;
    }
}
