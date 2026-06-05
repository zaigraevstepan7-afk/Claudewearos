package jh;

import ak.q;
import ak.r;
import android.content.Context;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final TaskCompletionSource f8933h = new TaskCompletionSource();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f8934i = false;

    /* renamed from: a, reason: collision with root package name */
    public final r f8935a = new r(new q());

    /* renamed from: b, reason: collision with root package name */
    public final p9.a f8936b = new p9.a();

    /* renamed from: c, reason: collision with root package name */
    public final a f8937c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f8938d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8939e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8940f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8941g;

    public c(Context context, String str, a aVar, Executor executor, Executor executor2) {
        this.f8938d = executor;
        e0.i(aVar);
        this.f8937c = aVar;
        e0.i(str);
        this.f8939e = str;
        try {
            new URL("europe-west1");
            this.f8940f = "us-central1";
            this.f8941g = "europe-west1";
        } catch (MalformedURLException unused) {
            this.f8940f = "europe-west1";
            this.f8941g = null;
        }
        synchronized (f8933h) {
            try {
                if (f8934i) {
                    return;
                }
                f8934i = true;
                executor2.execute(new b(context, 0));
            } finally {
            }
        }
    }
}
