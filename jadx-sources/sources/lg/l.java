package lg;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final l f10970a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f10971b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l[] f10972c;

    static {
        l lVar = new l("INSTANCE", 0);
        f10970a = lVar;
        f10972c = new l[]{lVar};
        f10971b = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f10972c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f10971b.post(runnable);
    }
}
