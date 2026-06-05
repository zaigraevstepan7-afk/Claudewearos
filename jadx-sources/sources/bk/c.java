package bk;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1784b;

    public /* synthetic */ c(String str, boolean z2) {
        this.f1783a = str;
        this.f1784b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f1783a);
        thread.setDaemon(this.f1784b);
        return thread;
    }
}
