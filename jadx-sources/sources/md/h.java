package md;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f11617b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f11618c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11619a;

    public /* synthetic */ h(int i10) {
        this.f11619a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11619a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
