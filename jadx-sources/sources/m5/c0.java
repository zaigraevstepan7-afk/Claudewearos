package m5;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class c0 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final File f11271a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f11272b = new AtomicBoolean(false);

    public c0(File file) {
        this.f11271a = file;
    }

    @Override // m5.a
    public final void close() {
        this.f11272b.set(true);
    }
}
