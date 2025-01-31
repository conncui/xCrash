/*
 * Copyright (C) 2019 Baidu Inc. All rights reserved.
 */

package xcrash.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author cuiguoqiang
 * @since 19-11-5
 */

public class FileUtil {
    public static void copy(File src, File dst) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dst);
            // Transfer bytes from in to out
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
        } catch (Exception e) {

        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }

    }
}
