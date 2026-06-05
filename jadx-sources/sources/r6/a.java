package r6;

import android.content.res.AssetManager;
import android.os.Build;
import c.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f13778a;

    /* renamed from: b, reason: collision with root package name */
    public final c f13779b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f13780c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13781d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13782e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13783f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f13784g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f13785h;

    public a(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        byte[] bArr;
        this.f13778a = executor;
        this.f13779b = cVar;
        this.f13782e = str;
        this.f13781d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            switch (i10) {
                case 27:
                    bArr = d.f13800f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = d.f13799e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = d.f13798d;
        }
        this.f13780c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f13779b.d();
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f13778a.execute(new k(this, i10, 2, serializable));
    }
}
