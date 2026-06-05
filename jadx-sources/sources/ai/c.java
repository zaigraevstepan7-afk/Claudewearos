package ai;

import android.content.res.AssetFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f500b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f499a = i10;
        this.f500b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        g gVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        switch (this.f499a) {
            case 0:
                q qVar = (q) this.f500b;
                synchronized (qVar) {
                    gVarA = null;
                    try {
                        fileInputStreamOpenFileInput = qVar.f576a.openFileInput(qVar.f577b);
                        try {
                            int iAvailable = fileInputStreamOpenFileInput.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                            gVarA = g.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStreamOpenFileInput.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return gVarA;
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th4) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th4;
                    }
                }
                return gVarA;
            case 1:
                return (AssetFileDescriptor) this.f500b;
            default:
                return ((zh.i) this.f500b).c();
        }
    }
}
